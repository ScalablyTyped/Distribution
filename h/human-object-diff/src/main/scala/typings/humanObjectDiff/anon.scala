package typings.humanObjectDiff

import typings.humanObjectDiff.distEngineUtilsArrayPreprocessorMod.Change
import typings.humanObjectDiff.humanObjectDiffStrings.I
import typings.humanObjectDiff.humanObjectDiffStrings.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AE extends StObject {
    
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
  object AE {
    
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
    ): AE = {
      val __obj = js.Dynamic.literal(AE = AE.asInstanceOf[js.Any], AES = AES.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], DS = DS.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], ES = ES.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], IS = IS.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], NS = NS.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], RS = RS.asInstanceOf[js.Any])
      __obj.asInstanceOf[AE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AE] (val x: Self) extends AnyVal {
      
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
  
  trait DotPath
    extends StObject
       with Change {
    
    var dotPath: String
    
    var index: Double
    
    var kind: I | R
    
    var path: js.Array[String]
    
    var `val`: Any
  }
  object DotPath {
    
    inline def apply(dotPath: String, index: Double, kind: I | R, path: js.Array[String], `val`: Any): DotPath = {
      val __obj = js.Dynamic.literal(dotPath = dotPath.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotPath] (val x: Self) extends AnyVal {
      
      inline def setDotPath(value: String): Self = StObject.set(x, "dotPath", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKind(value: I | R): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index
    extends StObject
       with Change {
    
    var dotPath: String
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isArray: Boolean
    
    var kind: /* import warning: importer.ImportType#apply Failed type conversion: 'prefilter'['templates'] */ js.Any
    
    var lhs: Any
    
    var path: js.Array[String]
    
    var rhs: Any
    
    var `val`: Any
  }
  object Index {
    
    inline def apply(
      dotPath: String,
      isArray: Boolean,
      kind: /* import warning: importer.ImportType#apply Failed type conversion: 'prefilter'['templates'] */ js.Any,
      lhs: Any,
      path: js.Array[String],
      rhs: Any,
      `val`: Any
    ): Index = {
      val __obj = js.Dynamic.literal(dotPath = dotPath.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setDotPath(value: String): Self = StObject.set(x, "dotPath", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setKind(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'prefilter'['templates'] */ js.Any
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLhs(value: Any): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRhs(value: Any): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  N :string,   D :string,   E :string,   I :string,   R :string,   AE :string,   NS :string,   DS :string,   ES :string,   IS :string,   RS :string,   AES :string}> */
  trait PartialNstringDstringEstr extends StObject {
    
    var AE: js.UndefOr[String] = js.undefined
    
    var AES: js.UndefOr[String] = js.undefined
    
    var D: js.UndefOr[String] = js.undefined
    
    var DS: js.UndefOr[String] = js.undefined
    
    var E: js.UndefOr[String] = js.undefined
    
    var ES: js.UndefOr[String] = js.undefined
    
    var I: js.UndefOr[String] = js.undefined
    
    var IS: js.UndefOr[String] = js.undefined
    
    var N: js.UndefOr[String] = js.undefined
    
    var NS: js.UndefOr[String] = js.undefined
    
    var R: js.UndefOr[String] = js.undefined
    
    var RS: js.UndefOr[String] = js.undefined
  }
  object PartialNstringDstringEstr {
    
    inline def apply(): PartialNstringDstringEstr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNstringDstringEstr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialNstringDstringEstr] (val x: Self) extends AnyVal {
      
      inline def setAE(value: String): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAES(value: String): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
      
      inline def setAESUndefined: Self = StObject.set(x, "AES", js.undefined)
      
      inline def setAEUndefined: Self = StObject.set(x, "AE", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setDS(value: String): Self = StObject.set(x, "DS", value.asInstanceOf[js.Any])
      
      inline def setDSUndefined: Self = StObject.set(x, "DS", js.undefined)
      
      inline def setDUndefined: Self = StObject.set(x, "D", js.undefined)
      
      inline def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setES(value: String): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setESUndefined: Self = StObject.set(x, "ES", js.undefined)
      
      inline def setEUndefined: Self = StObject.set(x, "E", js.undefined)
      
      inline def setI(value: String): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      inline def setIS(value: String): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setISUndefined: Self = StObject.set(x, "IS", js.undefined)
      
      inline def setIUndefined: Self = StObject.set(x, "I", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNS(value: String): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      inline def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setRS(value: String): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      inline def setRSUndefined: Self = StObject.set(x, "RS", js.undefined)
      
      inline def setRUndefined: Self = StObject.set(x, "R", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: js.UndefOr[js.Array[Any | String]] = js.undefined
  }
  object Path {
    
    inline def apply(): Path = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: js.Array[Any | String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (Any | String)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<human-object-diff.human-object-diff/dist/types.DiffConfigWithoutTemplates, 'dateFormat'> */
  trait PickDiffConfigWithoutTemp extends StObject {
    
    var dateFormat: String
  }
  object PickDiffConfigWithoutTemp {
    
    inline def apply(dateFormat: String): PickDiffConfigWithoutTemp = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickDiffConfigWithoutTemp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickDiffConfigWithoutTemp] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<human-object-diff.human-object-diff/dist/types.DiffConfig, 'dontHumanizePropertyNames'> */
  trait PickDiffConfigdontHumaniz extends StObject {
    
    var dontHumanizePropertyNames: Boolean
  }
  object PickDiffConfigdontHumaniz {
    
    inline def apply(dontHumanizePropertyNames: Boolean): PickDiffConfigdontHumaniz = {
      val __obj = js.Dynamic.literal(dontHumanizePropertyNames = dontHumanizePropertyNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickDiffConfigdontHumaniz]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickDiffConfigdontHumaniz] (val x: Self) extends AnyVal {
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
    }
  }
}
