package typings
package atJupyterlabServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stdout | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stderr
  var text: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(
    name: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stdout | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stderr,
    text: java.lang.String
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

