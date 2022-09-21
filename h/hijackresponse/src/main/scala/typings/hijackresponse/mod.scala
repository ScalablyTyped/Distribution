package typings.hijackresponse

import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.Response
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[ResBody](
    res: Response_[ResBody, Record[String, Any]],
    callback: js.Function2[/* err */ Null, /* res */ HijackedResponse[ResBody], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(res.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("hijackresponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof node.stream.Readable, keyof express.express.Response<any, std.Record<string, any>>> ]: node.stream.Readable[P]} */ @js.native
  trait HijackedResponse[ResBody] extends Response {
    
    def destroyHijacked(): Boolean = js.native
    
    def unhijack(): Response_[Any, Record[String, Any]] = js.native
  }
}
