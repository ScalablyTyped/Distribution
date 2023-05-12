package typings.listr2.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for the given event in the {@link EventMap}.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  Event extends keyof Map ? Map[Event] : never
  }}}
  */
@js.native
trait EventData[Event /* <: String */, Map /* <: Record[String, Any] */] extends StObject
