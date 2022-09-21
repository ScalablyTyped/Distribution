package typings.interactjsTypes

import typings.interactjsTypes.anon.Fn0
import typings.interactjsTypes.anon.InteractableDeltaSource
import typings.interactjsTypes.interactionMod.Interaction
import typings.interactjsTypes.scopeMod.Scope
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.ActionProps
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.PointerEventType
import typings.interactjsTypes.typesMod.PointerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactableMethodsMod {
  
  object default {
    
    @JSImport("@interactjs/auto-start/InteractableMethods", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/auto-start/InteractableMethods", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/auto-start/InteractableMethods", "default.install")
    @js.native
    def install: js.Function1[/* scope */ Scope, Unit] = js.native
    inline def install(scope: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def install_=(x: js.Function1[/* scope */ Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    @js.native
    trait Interactable extends StObject {
      
      def actionChecker(checker: Any): Any = js.native
      @JSName("actionChecker")
      var actionChecker_Original: js.ThisFunction1[/* this */ InteractableDeltaSource, /* checker */ Any, Any] = js.native
      
      def allowFrom(): Boolean = js.native
      def allowFrom(args: Any*): Interactable = js.native
      
      def getAction(
        pointer: PointerType,
        event: PointerEventType,
        interaction: Interaction[ActionName],
        element: Element
      ): ActionProps[scala.Nothing] | Null = js.native
      
      def ignoreFrom(): Boolean = js.native
      def ignoreFrom(args: Any*): Interactable = js.native
      
      def styleCursor(): Boolean = js.native
      def styleCursor(newValue: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof this */ js.Any = js.native
      @JSName("styleCursor")
      var styleCursor_Original: Fn0 = js.native
    }
  }
}
