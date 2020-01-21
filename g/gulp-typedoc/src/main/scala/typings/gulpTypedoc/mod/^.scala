package typings.gulpTypedoc.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typedoc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The plugin takes an object, of which all properties are passed transparently to typedoc. Pipe in TypeScript files.
    * The documentation files are not piped out.
    *
    * @param options Typedoc options
    * @return Empty output stream (ends when the files are written)
    */
  def apply(options: Options): ReadWriteStream = js.native
}

