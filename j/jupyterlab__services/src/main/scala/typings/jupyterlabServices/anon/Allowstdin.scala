package typings.jupyterlabServices.anon

import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allowstdin extends StObject {
  
  /**
    * Whether to allow stdin requests.
    * The default is `true`.
    */
  var allow_stdin: js.UndefOr[Boolean] = js.native
  
  /**
    * The code to execute.
    */
  var code: String = js.native
  
  /**
    * Whether to execute the code as quietly as possible.
    * The default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to the abort execution queue on an error.
    * The default is `false`.
    */
  var stop_on_error: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to store history of the execution.
    * The default `true` if silent is False.
    * It is forced to  `false ` if silent is `true`.
    */
  var store_history: js.UndefOr[Boolean] = js.native
  
  /**
    * A mapping of names to expressions to be evaluated in the
    * kernel's interactive namespace.
    */
  var user_expressions: js.UndefOr[JSONObject] = js.native
}
object Allowstdin {
  
  @scala.inline
  def apply(code: String): Allowstdin = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowstdin]
  }
  
  @scala.inline
  implicit class AllowstdinMutableBuilder[Self <: Allowstdin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_stdin(value: Boolean): Self = StObject.set(x, "allow_stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_stdinUndefined: Self = StObject.set(x, "allow_stdin", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setStop_on_error(value: Boolean): Self = StObject.set(x, "stop_on_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop_on_errorUndefined: Self = StObject.set(x, "stop_on_error", js.undefined)
    
    @scala.inline
    def setStore_history(value: Boolean): Self = StObject.set(x, "store_history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore_historyUndefined: Self = StObject.set(x, "store_history", js.undefined)
    
    @scala.inline
    def setUser_expressions(value: JSONObject): Self = StObject.set(x, "user_expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_expressionsUndefined: Self = StObject.set(x, "user_expressions", js.undefined)
  }
}
