package typings.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JqueryFileUploadConvenienceObject extends StObject {
  
  def abort(): JqueryFileUploadEnhancedPromise[_] = js.native
  
  def process(): JqueryFileUploadEnhancedPromise[_] = js.native
  def process(resolveFunc: js.UndefOr[scala.Nothing], rejectFunc: js.Function): JqueryFileUploadEnhancedPromise[_] = js.native
  def process(resolveFunc: js.Function): JqueryFileUploadEnhancedPromise[_] = js.native
  def process(resolveFunc: js.Function, rejectFunc: js.Function): JqueryFileUploadEnhancedPromise[_] = js.native
  
  def processing(): JqueryFileUploadEnhancedPromise[_] = js.native
  
  def progress(): JqueryFileUploadEnhancedPromise[_] = js.native
  
  def response(): JqueryFileUploadEnhancedPromise[_] = js.native
  
  def state(): JqueryFileUploadEnhancedPromise[_] = js.native
  
  def submit[T](): JqueryFileUploadEnhancedPromise[T] = js.native
}
