package typings.hapiPodium

import org.scalablytyped.runtime.StringDictionary
import typings.hapiPodium.hapiPodiumStrings.count
import typings.hapiPodium.mod.Podium.Criteria
import typings.hapiPodium.mod.Podium.EmitCriteria
import typings.hapiPodium.mod.Podium.Event
import typings.hapiPodium.mod.Podium.EventSettings
import typings.hapiPodium.mod.Podium.FewCriteria
import typings.hapiPodium.mod.Podium.Listener
import typings.hapiPodium.mod.Podium.OnceCriteria
import typings.std.Omit
import typings.std.PromiseSettledResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/podium", "Podium")
  @js.native
  /**
    * Creates a new podium emitter.
    *
    * @param events - If present, the value is passed to podium.registerEvent().
    * @param options - optional configuration options passed to podium.registerEvent().
    */
  open class Podium[Events] () extends StObject {
    def this(events: js.Array[Event[EventNames[Events]]]) = this()
    def this(events: Event[EventNames[Events]]) = this()
    def this(events: js.Array[Event[EventNames[Events]]], options: EventSettings) = this()
    def this(events: Unit, options: EventSettings) = this()
    def this(events: Event[EventNames[Events]], options: EventSettings) = this()
    
    /**
      * Subscribe a handler to an event. Same as podium.on().
      *
      * @param criteria - The subscription criteria.
      * @param listener - The handler method set to receive event updates. The function signature
      *                   depends on the block, spread, and tags options.
      * @param context - Optional object that binds to the listener handler.
      *
      * @returns A reference to the current emitter.
      */
    def addListener[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](criteria: Criteria[EventNames[Events]], listener: EventListener[Events, TArgs, Tcontext]): this.type = js.native
    def addListener[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](
      criteria: Criteria[EventNames[Events]],
      listener: EventListener[Events, TArgs, Tcontext],
      context: Tcontext
    ): this.type = js.native
    
    /**
      * Emits an event update to all the subscribed listeners.
      * @param criteria - The event update criteria.
      * @param data - The value emitted to the subscribers.
      */
    def emit(criteria: EmitCriteria[EventNames[Events]]): Unit = js.native
    def emit(criteria: EmitCriteria[EventNames[Events]], data: EmitData[Events]): Unit = js.native
    
    /**
      * Subscribes to an event by returning a promise that resolves when the event is emitted `count` times.
      *
      * @param criteria - The subscription criteria.
      *
      * @returns Promise with array where each item is an array of emitted arguments.
      */
    def few[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](criteria: FewCriteria[EventNames[Events]]): js.Promise[TArgs] = js.native
    
    /**
      * Emits an event update to all the subscribed listeners and resolves an array of their results.
      * @param criteria - The event update criteria.
      * @param data - The value emitted to the subscribers.
      */
    def gauge[T](criteria: EmitCriteria[EventNames[Events]]): js.Promise[js.Array[PromiseSettledResult[T]]] = js.native
    def gauge[T](criteria: EmitCriteria[EventNames[Events]], data: EmitData[Events]): js.Promise[js.Array[PromiseSettledResult[T]]] = js.native
    
    /**
      * Returns whether an event has any listeners subscribed.
      *
      * @param name  the event name string.
      *
      * @returns true if the event name has any listeners, otherwise false.
      */
    def hasListeners(name: String): Boolean = js.native
    
    /**
      * Removes all listeners subscribed to a given event name matching the provided listener method.
      *
      * @param name - The event name string.
      * @param listener - The function reference provided when subscribed.
      *
      * @returns A reference to the current emitter.
      */
    def off(name: String, listener: Listener[Any, js.Array[Any]]): this.type = js.native
    
    /**
      * Subscribe a handler to an event.
      *
      * @param criteria - The subscription criteria.
      * @param listener - The handler method set to receive event updates. The function signature
      *                   depends on the block, spread, and tags options.
      * @param context - Optional object that binds to the listener handler.
      *
      * @returns A reference to the current emitter.
      */
    def on[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](criteria: Criteria[EventNames[Events]], listener: EventListener[Events, TArgs, Tcontext]): this.type = js.native
    def on[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](
      criteria: Criteria[EventNames[Events]],
      listener: EventListener[Events, TArgs, Tcontext],
      context: Tcontext
    ): this.type = js.native
    
    /**
      * Subscribes to an event by returning a promise that resolves when the event is emitted.
      *
      * @param criteria - The subscription criteria.
      *
      * @returns Promise with array of emitted parameters.
      */
    def once[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](criteria: OnceCriteria[EventNames[Events]]): js.Promise[TArgs] = js.native
    /**
      * Same as podium.on() with the count option set to 1.
      *
      * Can also be called without an listener to wait for a single event.
      *
      * @param criteria - The subscription criteria.
      * @param listener - The handler method set to receive event updates. The function signature
      *                   depends on the block, spread, and tags options.
      * @param context - Optional object that binds to the listener handler.
      *
      * @returns A reference to the current emitter.
      */
    def once[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](criteria: OnceCriteria[EventNames[Events]], listener: EventListener[Events, TArgs, Tcontext]): this.type = js.native
    def once[TArgs /* <: js.Array[Any] */, Tcontext /* <: js.Object */](
      criteria: OnceCriteria[EventNames[Events]],
      listener: EventListener[Events, TArgs, Tcontext],
      context: Tcontext
    ): this.type = js.native
    
    def registerEvent(events: js.Array[Event[EventNames[Events]]]): Unit = js.native
    def registerEvent(events: js.Array[Event[EventNames[Events]]], options: EventSettings): Unit = js.native
    /**
      * Register the specified events and their optional configuration. Events must be registered
      * before they can be emitted or subscribed to. This is done to detect event name mispelling
      * and invalid event activities.
      *
      * @param events - The event(s) to register.
      * @param options - optional configuration options.
      */
    def registerEvent(events: Event[EventNames[Events]]): Unit = js.native
    def registerEvent(events: Event[EventNames[Events]], options: EventSettings): Unit = js.native
    
    /**
      * Removes all listeners subscribed to a given event name.
      *
      * @param name - The event name string.
      *
      * @returns A reference to the current emitter.
      */
    def removeAllListeners(name: String): this.type = js.native
    
    /**
      * Removes all listeners subscribed to a given event name matching the provided listener method.
      *
      * @param name - The event name string.
      * @param listener - The function reference provided when subscribed.
      *
      * @returns A reference to the current emitter.
      */
    def removeListener(name: String, listener: Listener[Any, js.Array[Any]]): this.type = js.native
  }
  object Podium {
    
    type Criteria[TName /* <: EventName */] = CriteriaInterface[TName] | TName
    
    trait CriteriaFilterOptionsObject extends StObject {
      
      /**
        * Require all tags to be present for the event update to match the subscription.
        *
        * Default false - Require at least one matching tag.
        */
      val all: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A tag string or array of tag strings.
        */
      val tags: js.UndefOr[String | js.Array[String]] = js.undefined
    }
    object CriteriaFilterOptionsObject {
      
      inline def apply(): CriteriaFilterOptionsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CriteriaFilterOptionsObject]
      }
      
      extension [Self <: CriteriaFilterOptionsObject](x: Self) {
        
        inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
        
        inline def setTags(value: String | js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
    
    trait CriteriaInterface[TName /* <: EventName */] extends StObject {
      
      /**
        * The event channels to subscribe to.
        *
        * If the event registration specified a list of allowed channels, the channels array must
        * match the allowed channels. If channels are specified, event updates without any channel
        * designation will not be included in the subscription.
        *
        * Defaults to no channels filter.
        */
      val channels: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * Set to clone the data object passed to podium.emit() before it is passed to the listener
        * method.
        *
        * Defaults to the event registration option (which defaults to false).
        */
      @JSName("clone")
      val clone_FCriteriaInterface: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A positive non-zero integer indicating the number of times the listener can be called
        * after which the subscription is automatically removed.
        *
        * Does nothing when calling once(), where it will use the value 1.
        *
        * Defaults to no limit.
        */
      val count: js.UndefOr[Double] = js.undefined
      
      /**
        * The event tags (if present) to subscribe to.
        */
      val filter: js.UndefOr[String | js.Array[String] | CriteriaFilterOptionsObject] = js.undefined
      
      /**
        * Event name.
        */
      val name: TName
      
      /**
        * Override the value of spread from the event registraiont when the listener is called.
        *
        * This should only be used when the emitted data structure is known and predictable.
        *
        * Defaults to the event registration option (which defaults to false).
        */
      val spread: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Override the value of tags from the event registraiont when the listener is called.
        *
        * Defaults to the event registration option (which defaults to false).
        */
      val tags: js.UndefOr[Boolean] = js.undefined
    }
    object CriteriaInterface {
      
      inline def apply[TName /* <: EventName */](name: TName): CriteriaInterface[TName] = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[CriteriaInterface[TName]]
      }
      
      extension [Self <: CriteriaInterface[?], TName /* <: EventName */](x: Self & CriteriaInterface[TName]) {
        
        inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
        
        inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
        
        inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
        
        inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
        
        inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setFilter(value: String | js.Array[String] | CriteriaFilterOptionsObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
        
        inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
        
        inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
        
        inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      }
    }
    
    type EmitCriteria[TName /* <: EventName */] = EmitCriteriaInterface[TName] | TName
    
    trait EmitCriteriaInterface[TName /* <: EventName */] extends StObject {
      
      /**
        * Channel name.
        */
      val channel: js.UndefOr[String] = js.undefined
      
      /**
        * Event name.
        */
      val name: TName
      
      /**
        * The tags to apply.
        */
      val tags: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
    }
    object EmitCriteriaInterface {
      
      inline def apply[TName /* <: EventName */](name: TName): EmitCriteriaInterface[TName] = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[EmitCriteriaInterface[TName]]
      }
      
      extension [Self <: EmitCriteriaInterface[?], TName /* <: EventName */](x: Self & EmitCriteriaInterface[TName]) {
        
        inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
        
        inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTags(value: String | js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
    
    type Event[TName /* <: EventName */] = TName | EventOptions[TName]
    
    type EventName = String | Double | js.Symbol
    
    type EventOptions[TName /* <: EventName */] = EventOptionsInterface[TName] | TName
    
    trait EventOptionsInterface[TName /* <: EventName */] extends StObject {
      
      /**
        * A string or array of strings specifying the event channels available.
        *
        * Defaults to no channel restrictions - Event updates can specify a channel or not.
        */
      val channels: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * Set to make podium.emit() clone the data object passed to it, before it is passed to the
        * listeners (unless an override specified by each listener).
        *
        * Defaults to false - Data is passed as-is.
        */
      @JSName("clone")
      val clone_FEventOptionsInterface: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Event name.
        */
      val name: TName
      
      /**
        * Set to allow the same event name to be registered multiple times, ignoring all but the
        * first.
        *
        * Note that if the registration config is changed between registrations, only the first
        * configuration is used.
        *
        * Defaults to false - A duplicate registration will throw an error.
        */
      val shared: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Set to require the data object passed to podium.emit() to be an array, and make the
        * listener method called with each array element passed as a separate argument (unless an
        * override specified by each listener).
        *
        * This should only be used when the emitted data structure is known and predictable.
        *
        * Defaults to false - Data is emitted as a single argument regardless of its type.
        */
      val spread: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Set to make any tags in the critieria object passed to podium.emit() map to an object
        * (where each tag string is the key and the value is true) which is appended to the emitted
        * arguments list at the end.
        *
        * A configuration override can be set by each listener.
        *
        * Defaults to false.
        */
      val tags: js.UndefOr[Boolean] = js.undefined
    }
    object EventOptionsInterface {
      
      inline def apply[TName /* <: EventName */](name: TName): EventOptionsInterface[TName] = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventOptionsInterface[TName]]
      }
      
      extension [Self <: EventOptionsInterface[?], TName /* <: EventName */](x: Self & EventOptionsInterface[TName]) {
        
        inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
        
        inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
        
        inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
        
        inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
        
        inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
        
        inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
        
        inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
        
        inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
        
        inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
        
        inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      }
    }
    
    trait EventSettings extends StObject {
      
      /**
        * If false, events are not validated. This is only allowed when the events
        * value is returned from Podium.validate().
        *
        * Defaults to true
        */
      val validate: js.UndefOr[Boolean] = js.undefined
    }
    object EventSettings {
      
      inline def apply(): EventSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventSettings]
      }
      
      extension [Self <: EventSettings](x: Self) {
        
        inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    /* Inlined @hapi/podium.@hapi/podium.WithRequiredProperty<@hapi/podium.@hapi/podium.Podium.CriteriaInterface<TName>, 'count'> */
    trait FewCriteria[TName /* <: EventName */] extends StObject {
      
      /**
        * The event channels to subscribe to.
        *
        * If the event registration specified a list of allowed channels, the channels array must
        * match the allowed channels. If channels are specified, event updates without any channel
        * designation will not be included in the subscription.
        *
        * Defaults to no channels filter.
        */
      val channels: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * Set to clone the data object passed to podium.emit() before it is passed to the listener
        * method.
        *
        * Defaults to the event registration option (which defaults to false).
        */
      @JSName("clone")
      val clone_FFewCriteria: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A positive non-zero integer indicating the number of times the listener can be called
        * after which the subscription is automatically removed.
        *
        * Does nothing when calling once(), where it will use the value 1.
        *
        * Defaults to no limit.
        */
      val count: js.UndefOr[Double] = js.undefined
      
      /**
        * The event tags (if present) to subscribe to.
        */
      val filter: js.UndefOr[String | js.Array[String] | CriteriaFilterOptionsObject] = js.undefined
      
      /**
        * Event name.
        */
      val name: TName
      
      /**
        * Override the value of spread from the event registraiont when the listener is called.
        *
        * This should only be used when the emitted data structure is known and predictable.
        *
        * Defaults to the event registration option (which defaults to false).
        */
      val spread: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Override the value of tags from the event registraiont when the listener is called.
        *
        * Defaults to the event registration option (which defaults to false).
        */
      val tags: js.UndefOr[Boolean] = js.undefined
    }
    object FewCriteria {
      
      inline def apply[TName /* <: EventName */](name: TName): FewCriteria[TName] = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[FewCriteria[TName]]
      }
      
      extension [Self <: FewCriteria[?], TName /* <: EventName */](x: Self & FewCriteria[TName]) {
        
        inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
        
        inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
        
        inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
        
        inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
        
        inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setFilter(value: String | js.Array[String] | CriteriaFilterOptionsObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
        
        inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
        
        inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
        
        inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      }
    }
    
    type Listener[TContext /* <: js.Object */, TArgs /* <: js.Array[Any] */] = js.ThisFunction1[/* this */ TContext, /* args */ TArgs, Any]
    
    type OnceCriteria[TName /* <: EventName */] = (Omit[CriteriaInterface[TName], count]) | TName
  }
  
  type EmitData[Events] = IfUndefinedElse[Events, Any, EventListenerParameters[Events]]
  
  type EventListener[Events, TArgs /* <: js.Array[Any] */, TContext /* <: js.Object */] = Listener[TContext, IfUndefinedElse[Events, TArgs, EventListenerParameters[Events]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Events[keyof Events] extends (args : any): any ? std.Parameters<Events[keyof Events]> : never
    }}}
    */
  @js.native
  trait EventListenerParameters[Events] extends StObject
  
  type EventNames[Events] = IfUndefinedElse[Events, String, /* keyof Events */ String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined ? If : Else
    }}}
    */
  type IfUndefinedElse[T, If, Else] = If
  
  type WithRequiredProperty[Type, Key /* <: /* keyof Type */ String */] = Type & (/* import warning: importer.ImportType#apply Failed type conversion: {[ Property in Key ]: -? Type[Property]} */ js.Any)
}
