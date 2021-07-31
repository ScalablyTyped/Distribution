package typings.iniparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iniparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse[T](file: String, callback: js.Function2[/* err */ js.Any, /* data */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parseString[T](data: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def parseSync[T](file: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(file.asInstanceOf[js.Any]).asInstanceOf[T]
}
