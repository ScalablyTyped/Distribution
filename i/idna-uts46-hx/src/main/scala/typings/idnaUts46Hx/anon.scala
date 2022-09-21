package typings.idnaUts46Hx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IDN extends StObject {
    
    var IDN: String
    
    var PC: String
  }
  object IDN {
    
    inline def apply(IDN: String, PC: String): IDN = {
      val __obj = js.Dynamic.literal(IDN = IDN.asInstanceOf[js.Any], PC = PC.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDN]
    }
    
    extension [Self <: IDN](x: Self) {
      
      inline def setIDN(value: String): Self = StObject.set(x, "IDN", value.asInstanceOf[js.Any])
      
      inline def setPC(value: String): Self = StObject.set(x, "PC", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDNPC extends StObject {
    
    var IDN: String | js.Array[String]
    
    var PC: String | js.Array[String]
  }
  object IDNPC {
    
    inline def apply(IDN: String | js.Array[String], PC: String | js.Array[String]): IDNPC = {
      val __obj = js.Dynamic.literal(IDN = IDN.asInstanceOf[js.Any], PC = PC.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDNPC]
    }
    
    extension [Self <: IDNPC](x: Self) {
      
      inline def setIDN(value: String | js.Array[String]): Self = StObject.set(x, "IDN", value.asInstanceOf[js.Any])
      
      inline def setIDNVarargs(value: String*): Self = StObject.set(x, "IDN", js.Array(value*))
      
      inline def setPC(value: String | js.Array[String]): Self = StObject.set(x, "PC", value.asInstanceOf[js.Any])
      
      inline def setPCVarargs(value: String*): Self = StObject.set(x, "PC", js.Array(value*))
    }
  }
  
  trait PC extends StObject {
    
    var IDN: js.Array[String]
    
    var PC: js.Array[String]
  }
  object PC {
    
    inline def apply(IDN: js.Array[String], PC: js.Array[String]): PC = {
      val __obj = js.Dynamic.literal(IDN = IDN.asInstanceOf[js.Any], PC = PC.asInstanceOf[js.Any])
      __obj.asInstanceOf[PC]
    }
    
    extension [Self <: PC](x: Self) {
      
      inline def setIDN(value: js.Array[String]): Self = StObject.set(x, "IDN", value.asInstanceOf[js.Any])
      
      inline def setIDNVarargs(value: String*): Self = StObject.set(x, "IDN", js.Array(value*))
      
      inline def setPC(value: js.Array[String]): Self = StObject.set(x, "PC", value.asInstanceOf[js.Any])
      
      inline def setPCVarargs(value: String*): Self = StObject.set(x, "PC", js.Array(value*))
    }
  }
  
  trait Transitional extends StObject {
    
    var transitional: Boolean
    
    var useStd3ASCII: Boolean
    
    var verifyDnsLength: Boolean
  }
  object Transitional {
    
    inline def apply(transitional: Boolean, useStd3ASCII: Boolean, verifyDnsLength: Boolean): Transitional = {
      val __obj = js.Dynamic.literal(transitional = transitional.asInstanceOf[js.Any], useStd3ASCII = useStd3ASCII.asInstanceOf[js.Any], verifyDnsLength = verifyDnsLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transitional]
    }
    
    extension [Self <: Transitional](x: Self) {
      
      inline def setTransitional(value: Boolean): Self = StObject.set(x, "transitional", value.asInstanceOf[js.Any])
      
      inline def setUseStd3ASCII(value: Boolean): Self = StObject.set(x, "useStd3ASCII", value.asInstanceOf[js.Any])
      
      inline def setVerifyDnsLength(value: Boolean): Self = StObject.set(x, "verifyDnsLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseStd3ASCII extends StObject {
    
    var useStd3ASCII: Boolean
  }
  object UseStd3ASCII {
    
    inline def apply(useStd3ASCII: Boolean): UseStd3ASCII = {
      val __obj = js.Dynamic.literal(useStd3ASCII = useStd3ASCII.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseStd3ASCII]
    }
    
    extension [Self <: UseStd3ASCII](x: Self) {
      
      inline def setUseStd3ASCII(value: Boolean): Self = StObject.set(x, "useStd3ASCII", value.asInstanceOf[js.Any])
    }
  }
}
