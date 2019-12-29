package typings.atMaterialDashUiStyles

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Props[Name /* <: String */] extends js.Object {
  var props: Record[
    Name, 
    /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
  ]
}

object Anon_Props {
  @scala.inline
  def apply[Name /* <: String */](
    props: Record[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
    ]
  ): Anon_Props[Name] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Props[Name]]
  }
}

