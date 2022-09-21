package typings.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JqueryFileUploadConvenienceObject extends StObject {
  
  def abort(): JqueryFileUploadEnhancedPromise[Any] = js.native
  
  def process(): JqueryFileUploadEnhancedPromise[Any] = js.native
  def process(resolveFunc: js.Function): JqueryFileUploadEnhancedPromise[Any] = js.native
  def process(resolveFunc: js.Function, rejectFunc: js.Function): JqueryFileUploadEnhancedPromise[Any] = js.native
  def process(resolveFunc: Unit, rejectFunc: js.Function): JqueryFileUploadEnhancedPromise[Any] = js.native
  
  def processing(): JqueryFileUploadEnhancedPromise[Any] = js.native
  
  def progress(): JqueryFileUploadEnhancedPromise[Any] = js.native
  
  def response(): JqueryFileUploadEnhancedPromise[Any] = js.native
  
  def state(): JqueryFileUploadEnhancedPromise[Any] = js.native
  
  def submit[T](): JqueryFileUploadEnhancedPromise[T] = js.native
}
