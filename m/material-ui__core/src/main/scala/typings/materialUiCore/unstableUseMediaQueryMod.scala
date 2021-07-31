package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableUseMediaQueryMod {
  
  @JSImport("@material-ui/core/useMediaQuery/unstable_useMediaQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(query: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait MuiMediaQueryList extends StObject {
    
    def addListener(listener: MuiMediaQueryListListener): Unit
    
    var matches: Boolean
    
    def removeListener(listener: MuiMediaQueryListListener): Unit
  }
  object MuiMediaQueryList {
    
    @scala.inline
    def apply(
      addListener: MuiMediaQueryListListener => Unit,
      matches: Boolean,
      removeListener: MuiMediaQueryListListener => Unit
    ): MuiMediaQueryList = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), matches = matches.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[MuiMediaQueryList]
    }
    
    @scala.inline
    implicit class MuiMediaQueryListMutableBuilder[Self <: MuiMediaQueryList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: MuiMediaQueryListListener => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveListener(value: MuiMediaQueryListListener => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait MuiMediaQueryListEvent extends StObject {
    
    var matches: Boolean
  }
  object MuiMediaQueryListEvent {
    
    @scala.inline
    def apply(matches: Boolean): MuiMediaQueryListEvent = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuiMediaQueryListEvent]
    }
    
    @scala.inline
    implicit class MuiMediaQueryListEventMutableBuilder[Self <: MuiMediaQueryListEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
  
  type MuiMediaQueryListListener = js.Function1[/* event */ MuiMediaQueryListEvent, Unit]
  
  trait Options extends StObject {
    
    var defaultMatches: js.UndefOr[Boolean] = js.undefined
    
    var noSsr: js.UndefOr[Boolean] = js.undefined
    
    var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, MuiMediaQueryList]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      @scala.inline
      def setNoSsr(value: Boolean): Self = StObject.set(x, "noSsr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSsrUndefined: Self = StObject.set(x, "noSsr", js.undefined)
      
      @scala.inline
      def setSsrMatchMedia(value: /* query */ String => MuiMediaQueryList): Self = StObject.set(x, "ssrMatchMedia", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSsrMatchMediaUndefined: Self = StObject.set(x, "ssrMatchMedia", js.undefined)
    }
  }
}
