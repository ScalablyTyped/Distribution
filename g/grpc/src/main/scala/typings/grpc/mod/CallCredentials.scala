package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallCredentials extends js.Object {
  
  /**
    * Creates a new CallCredentials object from properties of both this and
    * another CallCredentials object. This object's metadata generator will be
    * called first.
    * @param callCredentials The other CallCredentials object.
    */
  def compose(callCredentials: CallCredentials): CallCredentials = js.native
  
  /**
    * Asynchronously generates a new Metadata object.
    * @param options Options used in generating the Metadata object.
    */
  def generateMetadata(options: js.Object): js.Promise[Metadata] = js.native
}
object CallCredentials {
  
  @scala.inline
  def apply(compose: CallCredentials => CallCredentials, generateMetadata: js.Object => js.Promise[Metadata]): CallCredentials = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), generateMetadata = js.Any.fromFunction1(generateMetadata))
    __obj.asInstanceOf[CallCredentials]
  }
  
  @scala.inline
  implicit class CallCredentialsOps[Self <: CallCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompose(value: CallCredentials => CallCredentials): Self = this.set("compose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateMetadata(value: js.Object => js.Promise[Metadata]): Self = this.set("generateMetadata", js.Any.fromFunction1(value))
  }
}
