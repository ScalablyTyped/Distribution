package typings.jsonStreamStringify

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-stream-stringify", "JsonStreamStringify")
  @js.native
  open class JsonStreamStringify protected () extends Readable {
    def this(value: Any) = this()
    def this(value: Any, replacer: js.Array[Any]) = this()
    def this(value: Any, replacer: js.Function) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: String) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: Double) = this()
    def this(value: Any, replacer: js.Function, spaces: String) = this()
    def this(value: Any, replacer: js.Function, spaces: Double) = this()
    def this(value: Any, replacer: Unit, spaces: String) = this()
    def this(value: Any, replacer: Unit, spaces: Double) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: String, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: Double, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: Unit, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Function, spaces: String, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Function, spaces: Double, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Function, spaces: Unit, cycle: Boolean) = this()
    def this(value: Any, replacer: Unit, spaces: String, cycle: Boolean) = this()
    def this(value: Any, replacer: Unit, spaces: Double, cycle: Boolean) = this()
    def this(value: Any, replacer: Unit, spaces: Unit, cycle: Boolean) = this()
    
    /* private */ var __read: Any = js.native
    
    /* private */ var _push: Any = js.native
    
    /* private */ var addToStack: Any = js.native
    
    /* private */ var cycle: Any = js.native
    
    /* private */ var cycler: Any = js.native
    
    /* private */ var depth: Any = js.native
    
    /* private */ var end: Any = js.native
    
    /* private */ var error: Any = js.native
    
    /* private */ var gap: Any = js.native
    
    /* private */ var isReading: Any = js.native
    
    def path(): js.Array[String | Double] = js.native
    
    /* private */ var processArray: Any = js.native
    
    /* private */ var processObject: Any = js.native
    
    def processPrimitive(current: IStackItem): Unit = js.native
    
    /* private */ var processPromise: Any = js.native
    
    /* private */ var processReadableObject: Any = js.native
    
    /* private */ var processReadableString: Any = js.native
    
    /* private */ var processStackTopItem: Any = js.native
    
    /* private */ var pushCalled: Any = js.native
    
    /* private */ var readMore: Any = js.native
    
    /* private */ var removeFromStack: Any = js.native
    
    /* private */ var replacerArray: Any = js.native
    
    /* private */ var replacerFunction: Any = js.native
    
    /* private */ var stack: Any = js.native
    
    /* private */ var visited: Any = js.native
  }
  
  @js.native
  sealed trait Types extends StObject
  @JSImport("json-stream-stringify", "Types")
  @js.native
  object Types extends StObject {
    
    @js.native
    sealed trait Array
      extends StObject
         with Types
    
    @js.native
    sealed trait Object
      extends StObject
         with Types
    
    @js.native
    sealed trait Primitive
      extends StObject
         with Types
    
    @js.native
    sealed trait Promise
      extends StObject
         with Types
    
    @js.native
    sealed trait ReadableObject
      extends StObject
         with Types
    
    @js.native
    sealed trait ReadableString
      extends StObject
         with Types
  }
  
  trait IStackItem extends StObject {
    
    var addSeparatorAfterEnd: js.UndefOr[Boolean] = js.undefined
    
    var arrayLength: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var first: Boolean
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isEmpty: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[IStackItem] = js.undefined
    
    var readCount: js.UndefOr[Double] = js.undefined
    
    var `type`: Types
    
    var unread: js.UndefOr[js.Array[String] | Double] = js.undefined
    
    var value: Any
  }
  object IStackItem {
    
    inline def apply(first: Boolean, `type`: Types, value: Any): IStackItem = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStackItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStackItem] (val x: Self) extends AnyVal {
      
      inline def setAddSeparatorAfterEnd(value: Boolean): Self = StObject.set(x, "addSeparatorAfterEnd", value.asInstanceOf[js.Any])
      
      inline def setAddSeparatorAfterEndUndefined: Self = StObject.set(x, "addSeparatorAfterEnd", js.undefined)
      
      inline def setArrayLength(value: Double): Self = StObject.set(x, "arrayLength", value.asInstanceOf[js.Any])
      
      inline def setArrayLengthUndefined: Self = StObject.set(x, "arrayLength", js.undefined)
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setParent(value: IStackItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setReadCount(value: Double): Self = StObject.set(x, "readCount", value.asInstanceOf[js.Any])
      
      inline def setReadCountUndefined: Self = StObject.set(x, "readCount", js.undefined)
      
      inline def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnread(value: js.Array[String] | Double): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
      
      inline def setUnreadUndefined: Self = StObject.set(x, "unread", js.undefined)
      
      inline def setUnreadVarargs(value: String*): Self = StObject.set(x, "unread", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
