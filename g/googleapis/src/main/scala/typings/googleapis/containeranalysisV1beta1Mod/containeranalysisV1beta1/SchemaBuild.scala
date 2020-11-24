package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in the build details occurrence.
  */
@js.native
trait SchemaBuild extends js.Object {
  
  /**
    * Required. Immutable. Version of the builder which produced this build.
    */
  var builderVersion: js.UndefOr[String] = js.native
  
  /**
    * Signature of the build in occurrences pointing to this build note
    * containing build details.
    */
  var signature: js.UndefOr[SchemaBuildSignature] = js.native
}
object SchemaBuild {
  
  @scala.inline
  def apply(): SchemaBuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuild]
  }
  
  @scala.inline
  implicit class SchemaBuildOps[Self <: SchemaBuild] (val x: Self) extends AnyVal {
    
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
    def setBuilderVersion(value: String): Self = this.set("builderVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderVersion: Self = this.set("builderVersion", js.undefined)
    
    @scala.inline
    def setSignature(value: SchemaBuildSignature): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
