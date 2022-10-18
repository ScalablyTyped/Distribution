package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndRequest[RequestType] extends StObject {
  
  def end(): Unit = js.native
  def end(metadata: Metadata): Unit = js.native
  
  var request: RequestType = js.native
}
