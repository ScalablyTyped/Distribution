package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentLoader extends StObject {
  
  def abort(): Unit = js.native
  
  /* private */ val config: Any = js.native
  
  def destroy(): Unit = js.native
  
  def load(frag: Fragment): js.Promise[FragLoadedData] = js.native
  def load(frag: Fragment, onProgress: FragmentLoadProgressCallback): js.Promise[FragLoadedData] = js.native
  
  def loadPart(frag: Fragment, part: Part, onProgress: FragmentLoadProgressCallback): js.Promise[FragLoadedData] = js.native
  
  /* private */ var loader: Any = js.native
  
  /* private */ var partLoadTimeout: Any = js.native
  
  /* private */ var resetLoader: Any = js.native
  
  /* private */ var updateStatsFromPart: Any = js.native
}
