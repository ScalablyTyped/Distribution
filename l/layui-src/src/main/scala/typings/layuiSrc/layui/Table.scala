package typings.layuiSrc.layui

import typings.layuiSrc.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  def checkStatus(id: String): Data = js.native
  def exportFile(id: String, data: js.Any): Unit = js.native
  def exportFile(id: String, data: js.Any, `type`: String): Unit = js.native
  def init(filter: String, option: TableOption): js.Object = js.native
  // obj内容变化的，没法声明出指定，但这里提供了替代方案，
  /**
    * import TableOnCheckbox = layui.TableOnCheckbox;
    * table.on('checkbox(test)', function(obj){
    *     var rows:TableOnCheckbox=obj;
    *     然后，你就可以使用明确的属性了，两种方式编译后js中均为 var rows=obj; 输出不包含类型
    * });
    * 类型对应： （就是 TableOn+事件类型，无需记忆）
    * checkbox -> TableOnCheckbox
    * toolbar  -> TableOnToolbar
    * tool     -> TableOnTool
    * row      -> TableOnRow
    * edit-    -> TableOnEdit
    * sort     ->  TableOnSort
    * @param event
    * @param callback
    */
  def on(event: String, callback: js.ThisFunction1[/* this */ js.Any, /* obj */ js.Any, _]): Unit = js.native
  def reload(id: String, option: TableOption): Unit = js.native
  def reload(option: TableOption): Unit = js.native
  def render(option: TableOption): TableRendered = js.native
  def resize(id: String): Unit = js.native
  def set(option: TableOption): Unit = js.native
}

