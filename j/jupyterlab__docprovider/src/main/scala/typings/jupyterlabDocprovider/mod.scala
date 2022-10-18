package typings.jupyterlabDocprovider

import typings.jupyterlabDocprovider.libYproviderMod.WebSocketProviderWithLocks.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/docprovider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/docprovider", "IDocumentProviderFactory")
  @js.native
  val IDocumentProviderFactory: Token[typings.jupyterlabDocprovider.libTokensMod.IDocumentProviderFactory] = js.native
  
  @JSImport("@jupyterlab/docprovider", "ProviderMock")
  @js.native
  open class ProviderMock ()
    extends typings.jupyterlabDocprovider.libMockMod.ProviderMock
  
  @JSImport("@jupyterlab/docprovider", "WebSocketProviderWithLocks")
  @js.native
  open class WebSocketProviderWithLocks protected ()
    extends typings.jupyterlabDocprovider.libYproviderMod.WebSocketProviderWithLocks {
    /**
      * Construct a new WebSocketProviderWithLocks
      *
      * @param options The instantiation options for a WebSocketProviderWithLocks
      */
    def this(options: IOptions) = this()
  }
  
  inline def getAnonymousUserName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnonymousUserName")().asInstanceOf[String]
  
  inline def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
  
  @JSImport("@jupyterlab/docprovider", "moonsOfJupyter")
  @js.native
  val moonsOfJupyter: js.Array[String] = js.native
  
  @JSImport("@jupyterlab/docprovider", "userColors")
  @js.native
  val userColors: js.Array[String] = js.native
}
