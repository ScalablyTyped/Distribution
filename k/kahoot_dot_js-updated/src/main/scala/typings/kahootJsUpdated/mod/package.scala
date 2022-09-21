package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.Instantiable1
import typings.kahootJsUpdated.anon.Client
import typings.kahootJsUpdated.kahootJsUpdatedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Create a new constructor for Kahoot with the provided options as the defaults
  * @param options Default options to configure the client
  * @returns A new Kahoot constructor defaulting to the provided options
  */
/* static member */
inline def defaults(): Instantiable1[/* options */ js.UndefOr[KahootOptions], Kahoot] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Instantiable1[/* options */ js.UndefOr[KahootOptions], Kahoot]]
inline def defaults(options: KahootOptions): Instantiable1[/* options */ js.UndefOr[KahootOptions], Kahoot] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* options */ js.UndefOr[KahootOptions], Kahoot]]

/**
  * Creates a new client and joins the game with it
  * @param pin The game pin
  * @param name The player name to join with
  * @param team The team member names. If set to false, team members will not be automatically added
  * @fires Kahoot#Joined
  * @returns The client and the return of the join call
  */
/* static member */
inline def join(pin: String, name: String): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(pin.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Client]
inline def join(pin: String, name: String, team: js.Array[String]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(pin.asInstanceOf[js.Any], name.asInstanceOf[js.Any], team.asInstanceOf[js.Any])).asInstanceOf[Client]
inline def join(pin: Double, name: String): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(pin.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Client]
inline def join(pin: Double, name: String, team: js.Array[String]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(pin.asInstanceOf[js.Any], name.asInstanceOf[js.Any], team.asInstanceOf[js.Any])).asInstanceOf[Client]

inline def join_false(pin: String, name: String, team: `false`): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(pin.asInstanceOf[js.Any], name.asInstanceOf[js.Any], team.asInstanceOf[js.Any])).asInstanceOf[Client]
inline def join_false(pin: Double, name: String, team: `false`): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(pin.asInstanceOf[js.Any], name.asInstanceOf[js.Any], team.asInstanceOf[js.Any])).asInstanceOf[Client]

type GameBlockLayout = String

type GameBlockType = String
