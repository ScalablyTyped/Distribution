package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Boards")
@js.native
open class Boards[BoardsIDs /* <: BoardIdsListType */, BoardsConfig /* <: BoardConfigListType */] protected () extends StObject {
  /**
    * This class allows managing multiple boards at the same time.
    *
    * @param boardsIDs - Some IDs to match connected boards, associated serial/COM port is auto-guessed by `johnny-five`.
    *
    * **HINT** : Use `as const` to fix the type and take profit of auto-completion and strong typings. Otherwise TypeScript is not aware that the array won't be modified later.
    *
    * Example :
    * ```ts
    * const boards = new Boards(["UNO"] as const);
    * ```
    */
  /**
    * This class allows managing multiple boards at the same time.
    *
    * @param boardsIDs - Some IDs to match connected boards, if not provided associated serial/COM port is auto-guessed by `johnny-five`.
    *
    * **HINT** : Use `as const` to fix the type and take profit of auto-completion and strong typings. Otherwise TypeScript is not aware that the array won't be modified later.
    *
    * Example :
    * ```ts
    * const boards = new Boards([{id: "UNO"}] as const);
    * ```
    */
  // tslint:disable-next-line:unified-signatures
  def this(boardsIDs: BoardsConfig | BoardsIDs) = this()
  
  /**
    * Search for a board using its ID, given the typing you can't be wrong so it always returns a {@Link Board}.
    */
  def byId(
    id: /* import warning: importer.ImportType#apply Failed type conversion: BoardsIDs[number] */ js.Any
  ): Board | Null = js.native
  /**
    * Search for a board using its ID, given the typing you can't be wrong so it always returns a {@Link Board}
    */
  @JSName("byId")
  def byId_id(
    id: /* import warning: importer.ImportType#apply Failed type conversion: BoardsConfig[number]['id'] */ js.Any
  ): Board = js.native
  
  /** This function allows to iterate on all boards */
  def each(cb: js.Function1[/* board */ Board, Unit]): this.type = js.native
  
  /**
    * Listen for ready to work status !
    *
    * @param event - `ready` When the boards are ready to operate on external components this event is triggered.
    * @param cb - The callback is filled with a map of boards with their names.
    */
  def on(
    event: ready,
    cb: js.Function1[
      /* boards */ IDBoardMap[
        /* import warning: importer.ImportType#apply Failed type conversion: BoardsIDs[number] */ js.Any
      ], 
      Unit
    ]
  ): this.type = js.native
}
