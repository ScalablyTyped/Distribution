package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents a particular package that is distributed over various
  * channels. e.g. glibc (aka libc6) is distributed by many, at various
  * versions.
  */
trait SchemaPackage extends StObject {
  
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[SchemaDistribution]] = js.undefined
  
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPackage {
  
  inline def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  
  extension [Self <: SchemaPackage](x: Self) {
    
    inline def setDistribution(value: js.Array[SchemaDistribution]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setDistributionVarargs(value: SchemaDistribution*): Self = StObject.set(x, "distribution", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
