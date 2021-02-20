package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents a particular package that is distributed over various
  * channels. E.g., glibc (aka libc6) is distributed by many, at various
  * versions.
  */
@js.native
trait SchemaPackage extends StObject {
  
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[SchemaDistribution]] = js.native
  
  /**
    * Required. Immutable. The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPackage {
  
  @scala.inline
  def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  
  @scala.inline
  implicit class SchemaPackageMutableBuilder[Self <: SchemaPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistribution(value: js.Array[SchemaDistribution]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setDistributionVarargs(value: SchemaDistribution*): Self = StObject.set(x, "distribution", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
