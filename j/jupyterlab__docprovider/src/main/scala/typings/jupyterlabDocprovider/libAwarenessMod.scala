package typings.jupyterlabDocprovider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAwarenessMod {
  
  @JSImport("@jupyterlab/docprovider/lib/awareness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnonymousUserName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnonymousUserName")().asInstanceOf[String]
  
  inline def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
  
  @JSImport("@jupyterlab/docprovider/lib/awareness", "moonsOfJupyter")
  @js.native
  val moonsOfJupyter: js.Array[String] = js.native
  
  @JSImport("@jupyterlab/docprovider/lib/awareness", "userColors")
  @js.native
  val userColors: js.Array[String] = js.native
}
