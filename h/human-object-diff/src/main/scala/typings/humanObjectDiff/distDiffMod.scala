package typings.humanObjectDiff

import typings.deepDiff.mod.Diff_
import typings.humanObjectDiff.humanObjectDiffStrings.A
import typings.humanObjectDiff.humanObjectDiffStrings.D
import typings.humanObjectDiff.humanObjectDiffStrings.E
import typings.humanObjectDiff.humanObjectDiffStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDiffMod {
  
  @JSImport("human-object-diff/dist/diff", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Diff {
    def this(diff: Diff_[Any, Any]) = this()
    
    /* CompleteClass */
    override val dotPath: String = js.native
    
    /* private */ /* CompleteClass */
    override val hasNestedChanges: Any = js.native
    
    /* CompleteClass */
    override val isArray: Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val item: Any = js.native
    
    /* CompleteClass */
    override val kind: N | D | A | E = js.native
    
    /* CompleteClass */
    override val lhs: Any = js.native
    
    /* CompleteClass */
    override val rhs: Any = js.native
    
    /* CompleteClass */
    var `val`: Any = js.native
  }
  
  trait Diff extends StObject {
    
    val dotPath: String
    
    /* private */ val hasNestedChanges: Any
    
    var index: js.UndefOr[Double] = js.undefined
    
    val isArray: Boolean
    
    /* private */ val item: Any
    
    val kind: N | D | A | E
    
    val lhs: Any
    
    val path: js.UndefOr[js.Array[Any]] = js.undefined
    
    val rhs: Any
    
    var `val`: Any
  }
  object Diff {
    
    inline def apply(
      dotPath: String,
      hasNestedChanges: Any,
      isArray: Boolean,
      item: Any,
      kind: N | D | A | E,
      lhs: Any,
      rhs: Any,
      `val`: Any
    ): Diff = {
      val __obj = js.Dynamic.literal(dotPath = dotPath.asInstanceOf[js.Any], hasNestedChanges = hasNestedChanges.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diff]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
      
      inline def setDotPath(value: String): Self = StObject.set(x, "dotPath", value.asInstanceOf[js.Any])
      
      inline def setHasNestedChanges(value: Any): Self = StObject.set(x, "hasNestedChanges", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKind(value: N | D | A | E): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLhs(value: Any): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRhs(value: Any): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
