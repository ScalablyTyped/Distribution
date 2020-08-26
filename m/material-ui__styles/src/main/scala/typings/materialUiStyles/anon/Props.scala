package typings.materialUiStyles.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[Name /* <: /* keyof any */ String */] extends js.Object {
  var props: Record[
    Name, 
    /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
  ] = js.native
}

object Props {
  @scala.inline
  def apply[/* <: / * keyof any * / java.lang.String */ Name](
    props: Record[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
    ]
  ): Props[Name] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[Name]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: / * keyof any * / java.lang.String */ Name] (val x: Self with Props[Name]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProps(
      value: Record[
          Name, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
        ]
    ): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

