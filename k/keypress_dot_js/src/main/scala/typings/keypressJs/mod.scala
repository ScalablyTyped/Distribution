package typings.keypressJs

import typings.std.Element
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keypress.js", "Listener")
  @js.native
  open class Listener () extends StObject {
    def this(element: Element) = this()
    def this(element: Unit, defaults: ListenerDefaults) = this()
    def this(element: Element, defaults: ListenerDefaults) = this()
    
    def counting_combo(
      keys: String,
      on_count_callback: js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], Any]
    ): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def get_registered_combos(): js.Array[Combo] = js.native
    
    def listen(): Unit = js.native
    
    def register_combo(combo: Combo): Combo = js.native
    
    def register_many(combos: js.Array[Combo]): js.Array[Combo] = js.native
    
    def reset(): Unit = js.native
    
    def sequence_combo(
      keys: String,
      callback: js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], Any]
    ): Unit = js.native
    
    def simple_combo(
      keys: String,
      on_keydown_callback: js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], Any]
    ): Unit = js.native
    
    def stop_listening(): Unit = js.native
    
    def unregister_combo(combo: String): Unit = js.native
    def unregister_combo(combo: Combo): Unit = js.native
    
    def unregister_many(combos: js.Array[Combo | String]): Unit = js.native
  }
  
  trait Combo extends StObject {
    
    var is_counting: js.UndefOr[Boolean] = js.undefined
    
    var is_exclusive: js.UndefOr[Boolean] = js.undefined
    
    var is_sequence: js.UndefOr[Boolean] = js.undefined
    
    var is_solitary: js.UndefOr[Boolean] = js.undefined
    
    var is_unordered: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[String] = js.undefined
    
    var on_keydown: js.UndefOr[
        js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], Any]
      ] = js.undefined
    
    var on_keyup: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], Any]] = js.undefined
    
    var on_release: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], Any]] = js.undefined
    
    var prevent_default: js.UndefOr[Boolean] = js.undefined
    
    var prevent_repeat: js.UndefOr[Boolean] = js.undefined
    
    var `this`: js.UndefOr[Element] = js.undefined
  }
  object Combo {
    
    inline def apply(): Combo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Combo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Combo] (val x: Self) extends AnyVal {
      
      inline def setIs_counting(value: Boolean): Self = StObject.set(x, "is_counting", value.asInstanceOf[js.Any])
      
      inline def setIs_countingUndefined: Self = StObject.set(x, "is_counting", js.undefined)
      
      inline def setIs_exclusive(value: Boolean): Self = StObject.set(x, "is_exclusive", value.asInstanceOf[js.Any])
      
      inline def setIs_exclusiveUndefined: Self = StObject.set(x, "is_exclusive", js.undefined)
      
      inline def setIs_sequence(value: Boolean): Self = StObject.set(x, "is_sequence", value.asInstanceOf[js.Any])
      
      inline def setIs_sequenceUndefined: Self = StObject.set(x, "is_sequence", js.undefined)
      
      inline def setIs_solitary(value: Boolean): Self = StObject.set(x, "is_solitary", value.asInstanceOf[js.Any])
      
      inline def setIs_solitaryUndefined: Self = StObject.set(x, "is_solitary", js.undefined)
      
      inline def setIs_unordered(value: Boolean): Self = StObject.set(x, "is_unordered", value.asInstanceOf[js.Any])
      
      inline def setIs_unorderedUndefined: Self = StObject.set(x, "is_unordered", js.undefined)
      
      inline def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setOn_keydown(value: (/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double]) => Any): Self = StObject.set(x, "on_keydown", js.Any.fromFunction2(value))
      
      inline def setOn_keydownUndefined: Self = StObject.set(x, "on_keydown", js.undefined)
      
      inline def setOn_keyup(value: /* event */ js.UndefOr[KeyboardEvent] => Any): Self = StObject.set(x, "on_keyup", js.Any.fromFunction1(value))
      
      inline def setOn_keyupUndefined: Self = StObject.set(x, "on_keyup", js.undefined)
      
      inline def setOn_release(value: /* event */ js.UndefOr[KeyboardEvent] => Any): Self = StObject.set(x, "on_release", js.Any.fromFunction1(value))
      
      inline def setOn_releaseUndefined: Self = StObject.set(x, "on_release", js.undefined)
      
      inline def setPrevent_default(value: Boolean): Self = StObject.set(x, "prevent_default", value.asInstanceOf[js.Any])
      
      inline def setPrevent_defaultUndefined: Self = StObject.set(x, "prevent_default", js.undefined)
      
      inline def setPrevent_repeat(value: Boolean): Self = StObject.set(x, "prevent_repeat", value.asInstanceOf[js.Any])
      
      inline def setPrevent_repeatUndefined: Self = StObject.set(x, "prevent_repeat", js.undefined)
      
      inline def setThis(value: Element): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
      
      inline def setThisUndefined: Self = StObject.set(x, "this", js.undefined)
    }
  }
  
  trait ListenerDefaults extends StObject {
    
    var is_counting: Boolean
    
    var is_exclusive: Boolean
    
    var is_sequence: Boolean
    
    var is_solitary: Boolean
    
    var is_unordered: Boolean
    
    var keys: String
    
    var prevent_default: Boolean
    
    var prevent_repeat: Boolean
  }
  object ListenerDefaults {
    
    inline def apply(
      is_counting: Boolean,
      is_exclusive: Boolean,
      is_sequence: Boolean,
      is_solitary: Boolean,
      is_unordered: Boolean,
      keys: String,
      prevent_default: Boolean,
      prevent_repeat: Boolean
    ): ListenerDefaults = {
      val __obj = js.Dynamic.literal(is_counting = is_counting.asInstanceOf[js.Any], is_exclusive = is_exclusive.asInstanceOf[js.Any], is_sequence = is_sequence.asInstanceOf[js.Any], is_solitary = is_solitary.asInstanceOf[js.Any], is_unordered = is_unordered.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], prevent_default = prevent_default.asInstanceOf[js.Any], prevent_repeat = prevent_repeat.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenerDefaults] (val x: Self) extends AnyVal {
      
      inline def setIs_counting(value: Boolean): Self = StObject.set(x, "is_counting", value.asInstanceOf[js.Any])
      
      inline def setIs_exclusive(value: Boolean): Self = StObject.set(x, "is_exclusive", value.asInstanceOf[js.Any])
      
      inline def setIs_sequence(value: Boolean): Self = StObject.set(x, "is_sequence", value.asInstanceOf[js.Any])
      
      inline def setIs_solitary(value: Boolean): Self = StObject.set(x, "is_solitary", value.asInstanceOf[js.Any])
      
      inline def setIs_unordered(value: Boolean): Self = StObject.set(x, "is_unordered", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setPrevent_default(value: Boolean): Self = StObject.set(x, "prevent_default", value.asInstanceOf[js.Any])
      
      inline def setPrevent_repeat(value: Boolean): Self = StObject.set(x, "prevent_repeat", value.asInstanceOf[js.Any])
    }
  }
}
