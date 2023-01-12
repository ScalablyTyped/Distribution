package typings.humanObjectDiff

import typings.humanObjectDiff.mod.PathPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<human-object-diff.human-object-diff.TemplateType, string> */
  trait RecordTemplateTypestring extends StObject {
    
    var AE: String
    
    var AES: String
    
    var D: String
    
    var DS: String
    
    var E: String
    
    var ES: String
    
    var I: String
    
    var IS: String
    
    var N: String
    
    var NS: String
    
    var R: String
    
    var RS: String
  }
  object RecordTemplateTypestring {
    
    inline def apply(
      AE: String,
      AES: String,
      D: String,
      DS: String,
      E: String,
      ES: String,
      I: String,
      IS: String,
      N: String,
      NS: String,
      R: String,
      RS: String
    ): RecordTemplateTypestring = {
      val __obj = js.Dynamic.literal(AE = AE.asInstanceOf[js.Any], AES = AES.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], DS = DS.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], ES = ES.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], IS = IS.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], NS = NS.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], RS = RS.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordTemplateTypestring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordTemplateTypestring] (val x: Self) extends AnyVal {
      
      inline def setAE(value: String): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAES(value: String): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
      
      inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setDS(value: String): Self = StObject.set(x, "DS", value.asInstanceOf[js.Any])
      
      inline def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setES(value: String): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setI(value: String): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      inline def setIS(value: String): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNS(value: String): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setRS(value: String): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<human-object-diff.human-object-diff.Options> */
  trait RequiredOptions extends StObject {
    
    var dateFormat: String
    
    var dontHumanizePropertyNames: Boolean
    
    var ignoreArrays: Boolean
    
    var objectName: String
    
    var prefilter: js.Array[String] | PathPredicate
    
    var sensitivePaths: js.Array[String]
    
    var templates: RecordTemplateTypestring
  }
  object RequiredOptions {
    
    inline def apply(
      dateFormat: String,
      dontHumanizePropertyNames: Boolean,
      ignoreArrays: Boolean,
      objectName: String,
      prefilter: js.Array[String] | PathPredicate,
      sensitivePaths: js.Array[String],
      templates: RecordTemplateTypestring
    ): RequiredOptions = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dontHumanizePropertyNames = dontHumanizePropertyNames.asInstanceOf[js.Any], ignoreArrays = ignoreArrays.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], prefilter = prefilter.asInstanceOf[js.Any], sensitivePaths = sensitivePaths.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredOptions] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArrays(value: Boolean): Self = StObject.set(x, "ignoreArrays", value.asInstanceOf[js.Any])
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setPrefilter(value: js.Array[String] | PathPredicate): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
      
      inline def setPrefilterFunction2(value: (/* path */ js.Array[String | Double], /* key */ String | Double) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterVarargs(value: String*): Self = StObject.set(x, "prefilter", js.Array(value*))
      
      inline def setSensitivePaths(value: js.Array[String]): Self = StObject.set(x, "sensitivePaths", value.asInstanceOf[js.Any])
      
      inline def setSensitivePathsVarargs(value: String*): Self = StObject.set(x, "sensitivePaths", js.Array(value*))
      
      inline def setTemplates(value: RecordTemplateTypestring): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
}
