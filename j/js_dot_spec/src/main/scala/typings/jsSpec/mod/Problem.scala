package typings.jsSpec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Problem extends js.Object {
  
  /**
    * The path to the value.
    */
  val path: js.Array[String] = js.native
  
  /**
    * A predicate function to test new values for conformance.
    */
  def predicate(value: js.Any): Boolean = js.native
  
  /**
    * The value associated with the problem.
    */
  val value: js.Any = js.native
  
  /**
    * Path to the Spec that applies.
    */
  val via: js.Array[String] = js.native
}
object Problem {
  
  @scala.inline
  def apply(path: js.Array[String], predicate: js.Any => Boolean, value: js.Any, via: js.Array[String]): Problem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate), value = value.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Problem]
  }
  
  @scala.inline
  implicit class ProblemOps[Self <: Problem] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: js.Any => Boolean): Self = this.set("predicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaVarargs(value: String*): Self = this.set("via", js.Array(value :_*))
    
    @scala.inline
    def setVia(value: js.Array[String]): Self = this.set("via", value.asInstanceOf[js.Any])
  }
}
