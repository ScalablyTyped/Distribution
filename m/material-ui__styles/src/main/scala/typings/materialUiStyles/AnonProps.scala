package typings.materialUiStyles

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps[Name /* <: String */] extends js.Object {
  var props: Record[
    Name, 
    /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
  ]
}

object AnonProps {
  @scala.inline
  def apply[Name /* <: String */](
    props: Record[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
    ]
  ): AnonProps[Name] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProps[Name]]
  }
}

