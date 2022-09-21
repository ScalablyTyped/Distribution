package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckUpgradeRequest extends StObject {
  
  /**
    * The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+(\.[0-9]+\.[0-9]+(-preview\.[0-9]+)?)?|latest)-airflow-([0-9]+(\.[0-9]+(\.[0-9]+)?)?)`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the image version is a full [semantic version](https://semver.org), or an alias in the form of major version number or `latest`. When an alias is provided, the server replaces it with the current Cloud Composer version that satisfies the alias. The Apache Airflow portion of the image version is a full semantic version that points to one of the supported Apache Airflow versions, or an alias in the form of only major or major.minor versions specified. When an alias is provided, the server replaces it with the latest Apache Airflow version that satisfies the alias and is supported in the given Cloud Composer version. In all cases, the resolved image version is stored in the same field. See also [version list](/composer/docs/concepts/versioning/composer-versions) and [versioning overview](/composer/docs/concepts/versioning/composer-versioning-overview).
    */
  var imageVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaCheckUpgradeRequest {
  
  inline def apply(): SchemaCheckUpgradeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckUpgradeRequest]
  }
  
  extension [Self <: SchemaCheckUpgradeRequest](x: Self) {
    
    inline def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionNull: Self = StObject.set(x, "imageVersion", null)
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
  }
}
