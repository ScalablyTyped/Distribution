package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeRequireMod {
  
  @JSImport("marko/node-require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getExtensions(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensions")().asInstanceOf[js.Any]
  
  @scala.inline
  def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  @scala.inline
  def install(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
