package typings.hlsJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hlsJs.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyLoader
  extends StObject
     with ComponentAPI {
  
  def abort(): Unit = js.native
  def abort(`type`: PlaylistLevelType): Unit = js.native
  
  /* private */ val config: Any = js.native
  
  def createKeyLoadError(frag: Fragment, details: Unit, error: js.Error): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: Unit, error: js.Error, networkDetails: Any): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: Unit, error: js.Error, networkDetails: Any, response: Text): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: Unit, error: js.Error, networkDetails: Unit, response: Text): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: ErrorDetails, error: js.Error): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: ErrorDetails, error: js.Error, networkDetails: Any): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: ErrorDetails, error: js.Error, networkDetails: Any, response: Text): LoadError = js.native
  def createKeyLoadError(frag: Fragment, details: ErrorDetails, error: js.Error, networkDetails: Unit, response: Text): LoadError = js.native
  
  def detach(): Unit = js.native
  
  var emeController: EMEController | Null = js.native
  
  var keyUriToKeyInfo: StringDictionary[KeyLoaderInfo] = js.native
  
  def load(frag: Fragment): js.Promise[KeyLoadedData] = js.native
  
  def loadClear(loadingFrag: Fragment, encryptedFragments: js.Array[Fragment]): Unit | js.Promise[Unit] = js.native
  
  def loadInternal(frag: Fragment): js.Promise[KeyLoadedData] = js.native
  def loadInternal(frag: Fragment, keySystemFormat: KeySystemFormats): js.Promise[KeyLoadedData] = js.native
  
  def loadKeyEME(keyInfo: KeyLoaderInfo, frag: Fragment): js.Promise[KeyLoadedData] = js.native
  
  def loadKeyHTTP(keyInfo: KeyLoaderInfo, frag: Fragment): js.Promise[KeyLoadedData] = js.native
  
  /* private */ var resetLoader: Any = js.native
}
