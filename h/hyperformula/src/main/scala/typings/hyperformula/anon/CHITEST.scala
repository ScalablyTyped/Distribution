package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHITEST extends StObject {
  
  var CHITEST: String
  
  var COVAR: String
  
  var COVARIANCEP: String
  
  var COVARIANCES: String
  
  var FTEST: String
  
  var PEARSON: String
  
  var SKEWP: String
  
  var TTEST: String
  
  var ZTEST: String
}
object CHITEST {
  
  inline def apply(
    CHITEST: String,
    COVAR: String,
    COVARIANCEP: String,
    COVARIANCES: String,
    FTEST: String,
    PEARSON: String,
    SKEWP: String,
    TTEST: String,
    ZTEST: String
  ): CHITEST = {
    val __obj = js.Dynamic.literal(CHITEST = CHITEST.asInstanceOf[js.Any], COVAR = COVAR.asInstanceOf[js.Any], COVARIANCEP = COVARIANCEP.asInstanceOf[js.Any], COVARIANCES = COVARIANCES.asInstanceOf[js.Any], FTEST = FTEST.asInstanceOf[js.Any], PEARSON = PEARSON.asInstanceOf[js.Any], SKEWP = SKEWP.asInstanceOf[js.Any], TTEST = TTEST.asInstanceOf[js.Any], ZTEST = ZTEST.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHITEST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CHITEST] (val x: Self) extends AnyVal {
    
    inline def setCHITEST(value: String): Self = StObject.set(x, "CHITEST", value.asInstanceOf[js.Any])
    
    inline def setCOVAR(value: String): Self = StObject.set(x, "COVAR", value.asInstanceOf[js.Any])
    
    inline def setCOVARIANCEP(value: String): Self = StObject.set(x, "COVARIANCEP", value.asInstanceOf[js.Any])
    
    inline def setCOVARIANCES(value: String): Self = StObject.set(x, "COVARIANCES", value.asInstanceOf[js.Any])
    
    inline def setFTEST(value: String): Self = StObject.set(x, "FTEST", value.asInstanceOf[js.Any])
    
    inline def setPEARSON(value: String): Self = StObject.set(x, "PEARSON", value.asInstanceOf[js.Any])
    
    inline def setSKEWP(value: String): Self = StObject.set(x, "SKEWP", value.asInstanceOf[js.Any])
    
    inline def setTTEST(value: String): Self = StObject.set(x, "TTEST", value.asInstanceOf[js.Any])
    
    inline def setZTEST(value: String): Self = StObject.set(x, "ZTEST", value.asInstanceOf[js.Any])
  }
}
