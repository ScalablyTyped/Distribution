package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("locutus/php/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def jsonDecode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_decode")().asInstanceOf[js.Any]
  @scala.inline
  def jsonDecode(strJson: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_decode")(strJson.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def jsonEncode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_encode")().asInstanceOf[js.Any]
  @scala.inline
  def jsonEncode(mixedVal: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_encode")(mixedVal.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def jsonLastError(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json_last_error")().asInstanceOf[js.Any]
}
