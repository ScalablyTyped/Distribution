package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofndbMongodb extends js.Object {
  
  def exec(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  
  def exec_simple(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  
  def find(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  
  def find_one(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  
  def free_reply(name: String): Double = js.native
  
  def next_reply(name: String): Double = js.native
}
object TypeofndbMongodb {
  
  @scala.inline
  def apply(
    exec: (String, String, String, String, String) => Double,
    exec_simple: (String, String, String, String, String) => Double,
    find: (String, String, String, String, String) => Double,
    find_one: (String, String, String, String, String) => Double,
    free_reply: String => Double,
    next_reply: String => Double
  ): TypeofndbMongodb = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction5(exec), exec_simple = js.Any.fromFunction5(exec_simple), find = js.Any.fromFunction5(find), find_one = js.Any.fromFunction5(find_one), free_reply = js.Any.fromFunction1(free_reply), next_reply = js.Any.fromFunction1(next_reply))
    __obj.asInstanceOf[TypeofndbMongodb]
  }
  
  @scala.inline
  implicit class TypeofndbMongodbOps[Self <: TypeofndbMongodb] (val x: Self) extends AnyVal {
    
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
    def setExec(value: (String, String, String, String, String) => Double): Self = this.set("exec", js.Any.fromFunction5(value))
    
    @scala.inline
    def setExec_simple(value: (String, String, String, String, String) => Double): Self = this.set("exec_simple", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFind(value: (String, String, String, String, String) => Double): Self = this.set("find", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFind_one(value: (String, String, String, String, String) => Double): Self = this.set("find_one", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFree_reply(value: String => Double): Self = this.set("free_reply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext_reply(value: String => Double): Self = this.set("next_reply", js.Any.fromFunction1(value))
  }
}
