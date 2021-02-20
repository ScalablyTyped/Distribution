package typings.htmlparser2

import org.scalablytyped.runtime.StringDictionary
import typings.domhandler.mod.DomElement
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<domhandler.domhandler.DomHandler> */
  @js.native
  trait PartialDomHandler extends StObject {
    
    var constructor: js.UndefOr[
        js.Function1[
          /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _], 
          js.Any
        ]
      ] = js.native
    
    var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onclosetag: js.UndefOr[js.Function0[Unit]] = js.native
    
    var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
    
    var oncommentend: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onend: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onerror: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    var onopentag: js.UndefOr[js.Function2[/* name */ String, /* attribs */ StringDictionary[String], Unit]] = js.native
    
    var onparserinit: js.UndefOr[js.Function1[/* parser */ js.Any, Unit]] = js.native
    
    var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.native
    
    var onreset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  }
  object PartialDomHandler {
    
    @scala.inline
    def apply(): PartialDomHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDomHandler]
    }
    
    @scala.inline
    implicit class PartialDomHandlerMutableBuilder[Self <: PartialDomHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructor(
        value: /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _] => js.Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      @scala.inline
      def setOncdatastart(value: () => Unit): Self = StObject.set(x, "oncdatastart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncdatastartUndefined: Self = StObject.set(x, "oncdatastart", js.undefined)
      
      @scala.inline
      def setOnclosetag(value: () => Unit): Self = StObject.set(x, "onclosetag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnclosetagUndefined: Self = StObject.set(x, "onclosetag", js.undefined)
      
      @scala.inline
      def setOncomment(value: /* data */ String => Unit): Self = StObject.set(x, "oncomment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOncommentUndefined: Self = StObject.set(x, "oncomment", js.undefined)
      
      @scala.inline
      def setOncommentend(value: () => Unit): Self = StObject.set(x, "oncommentend", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncommentendUndefined: Self = StObject.set(x, "oncommentend", js.undefined)
      
      @scala.inline
      def setOnend(value: () => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      @scala.inline
      def setOnerror(value: /* error */ Error => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnopentag(value: (/* name */ String, /* attribs */ StringDictionary[String]) => Unit): Self = StObject.set(x, "onopentag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnopentagUndefined: Self = StObject.set(x, "onopentag", js.undefined)
      
      @scala.inline
      def setOnparserinit(value: /* parser */ js.Any => Unit): Self = StObject.set(x, "onparserinit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnparserinitUndefined: Self = StObject.set(x, "onparserinit", js.undefined)
      
      @scala.inline
      def setOnprocessinginstruction(value: (/* name */ String, /* data */ String) => Unit): Self = StObject.set(x, "onprocessinginstruction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnprocessinginstructionUndefined: Self = StObject.set(x, "onprocessinginstruction", js.undefined)
      
      @scala.inline
      def setOnreset(value: () => Unit): Self = StObject.set(x, "onreset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      @scala.inline
      def setOntext(value: /* data */ String => Unit): Self = StObject.set(x, "ontext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntextUndefined: Self = StObject.set(x, "ontext", js.undefined)
    }
  }
}
