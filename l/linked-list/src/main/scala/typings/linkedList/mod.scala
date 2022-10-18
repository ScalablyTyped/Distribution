package typings.linkedList

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linked-list", "Item")
  @js.native
  open class Item () extends StObject {
    
    def append[T /* <: this.type */](item: T): T = js.native
    
    def detach(): this.type = js.native
    
    var list: typings.linkedList.mod.List[this.type] = js.native
    
    var next: this.type = js.native
    
    def prepend[T /* <: this.type */](item: T): T = js.native
    
    var prev: this.type = js.native
  }
  
  @JSImport("linked-list", "List")
  @js.native
  open class List[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Item */ Any */] protected ()
    extends StObject
       with Iterable[T] {
    def this(items: T*) = this()
    
    def append[T](item: T): T = js.native
    
    var head: T | Null = js.native
    
    def prepend[T](item: T): T = js.native
    
    var size: Double = js.native
    
    var tail: T | Null = js.native
    
    def toArray(): js.Array[T] = js.native
  }
  /* static members */
  object List {
    
    @JSImport("linked-list", "List")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Item */ Any */](items: js.Iterable[T]): typings.linkedList.mod.List[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(items.asInstanceOf[js.Any]).asInstanceOf[typings.linkedList.mod.List[T]]
    
    inline def of[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Item */ Any */](items: T*): typings.linkedList.mod.List[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.linkedList.mod.List[T]]
  }
}
