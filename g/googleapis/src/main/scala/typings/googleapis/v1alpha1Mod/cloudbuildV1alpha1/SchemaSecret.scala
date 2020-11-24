package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pairs a set of secret environment variables containing encrypted values
  * with the Cloud KMS key to use to decrypt the value.
  */
@js.native
trait SchemaSecret extends js.Object {
  
  /**
    * Cloud KMS key name to use to decrypt these envs.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  
  /**
    * Map of environment variable name to its encrypted value.  Secret
    * environment variables must be unique across all of a build&#39;s secrets,
    * and must be used by at least one build step. Values can be at most 64 KB
    * in size. There can be at most 100 secret values across all of a
    * build&#39;s secrets.
    */
  var secretEnv: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaSecret {
  
  @scala.inline
  def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  
  @scala.inline
  implicit class SchemaSecretOps[Self <: SchemaSecret] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    
    @scala.inline
    def setSecretEnv(value: StringDictionary[String]): Self = this.set("secretEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretEnv: Self = this.set("secretEnv", js.undefined)
  }
}
