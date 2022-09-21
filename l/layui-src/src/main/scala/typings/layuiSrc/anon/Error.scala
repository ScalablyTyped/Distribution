package typings.layuiSrc.anon

import typings.layuiSrc.layuiSrcStrings.debug
import typings.layuiSrc.layuiSrcStrings.info
import typings.layuiSrc.layuiSrcStrings.log
import typings.layuiSrc.layuiSrcStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  def error(msg: Any): Unit = js.native
  def error(msg: Any, `type`: log | info | typings.layuiSrc.layuiSrcStrings.error | warn | debug): Unit = js.native
  def error(msg: Any, `type`: String): Unit = js.native
}
