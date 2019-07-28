package typings.jscodeshift.srcCollectionsJSXElementMod

import typings.jscodeshift.srcCollectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalMethods extends js.Object {
  /**
    * Finds all JSXElements optionally filtered by name
    */
  def findJSXElements(): Collection[JSXElement] = js.native
  def findJSXElements(name: String): Collection[JSXElement] = js.native
  /**
    * Finds all JSXElements by module name. Given
    *
    *     var Bar = require('Foo');
    *     <Bar />
    *
    * findJSXElementsByModuleName('Foo') will find <Bar />, without having to
    * know the variable name.
    */
  def findJSXElementsByModuleName(moduleName: String): Collection[JSXElement] = js.native
}

