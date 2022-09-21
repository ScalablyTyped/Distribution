package typings.htmlparser2

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.libParserMod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecodeEntities extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeEntities {
    
    inline def apply(): DecodeEntities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeEntities]
    }
    
    extension [Self <: DecodeEntities](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
  
  /* Inlined std.Partial<htmlparser2.htmlparser2/lib/Parser.Handler> */
  trait PartialHandler extends StObject {
    
    var onattribute: js.UndefOr[
        js.Function3[/* name */ String, /* value */ String, /* quote */ js.UndefOr[String | Null], Unit]
      ] = js.undefined
    
    var oncdataend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onclosetag: js.UndefOr[js.Function2[/* name */ String, /* isImplied */ Boolean, Unit]] = js.undefined
    
    var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
    
    var oncommentend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onopentag: js.UndefOr[
        js.Function3[
          /* name */ String, 
          /* attribs */ StringDictionary[String], 
          /* isImplied */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var onopentagname: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
    
    var onparserinit: js.UndefOr[js.Function1[/* parser */ Parser, Unit]] = js.undefined
    
    var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.undefined
    
    var onreset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  }
  object PartialHandler {
    
    inline def apply(): PartialHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHandler]
    }
    
    extension [Self <: PartialHandler](x: Self) {
      
      inline def setOnattribute(value: (/* name */ String, /* value */ String, /* quote */ js.UndefOr[String | Null]) => Unit): Self = StObject.set(x, "onattribute", js.Any.fromFunction3(value))
      
      inline def setOnattributeUndefined: Self = StObject.set(x, "onattribute", js.undefined)
      
      inline def setOncdataend(value: () => Unit): Self = StObject.set(x, "oncdataend", js.Any.fromFunction0(value))
      
      inline def setOncdataendUndefined: Self = StObject.set(x, "oncdataend", js.undefined)
      
      inline def setOncdatastart(value: () => Unit): Self = StObject.set(x, "oncdatastart", js.Any.fromFunction0(value))
      
      inline def setOncdatastartUndefined: Self = StObject.set(x, "oncdatastart", js.undefined)
      
      inline def setOnclosetag(value: (/* name */ String, /* isImplied */ Boolean) => Unit): Self = StObject.set(x, "onclosetag", js.Any.fromFunction2(value))
      
      inline def setOnclosetagUndefined: Self = StObject.set(x, "onclosetag", js.undefined)
      
      inline def setOncomment(value: /* data */ String => Unit): Self = StObject.set(x, "oncomment", js.Any.fromFunction1(value))
      
      inline def setOncommentUndefined: Self = StObject.set(x, "oncomment", js.undefined)
      
      inline def setOncommentend(value: () => Unit): Self = StObject.set(x, "oncommentend", js.Any.fromFunction0(value))
      
      inline def setOncommentendUndefined: Self = StObject.set(x, "oncommentend", js.undefined)
      
      inline def setOnend(value: () => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction0(value))
      
      inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      inline def setOnerror(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnopentag(
        value: (/* name */ String, /* attribs */ StringDictionary[String], /* isImplied */ Boolean) => Unit
      ): Self = StObject.set(x, "onopentag", js.Any.fromFunction3(value))
      
      inline def setOnopentagUndefined: Self = StObject.set(x, "onopentag", js.undefined)
      
      inline def setOnopentagname(value: /* name */ String => Unit): Self = StObject.set(x, "onopentagname", js.Any.fromFunction1(value))
      
      inline def setOnopentagnameUndefined: Self = StObject.set(x, "onopentagname", js.undefined)
      
      inline def setOnparserinit(value: /* parser */ Parser => Unit): Self = StObject.set(x, "onparserinit", js.Any.fromFunction1(value))
      
      inline def setOnparserinitUndefined: Self = StObject.set(x, "onparserinit", js.undefined)
      
      inline def setOnprocessinginstruction(value: (/* name */ String, /* data */ String) => Unit): Self = StObject.set(x, "onprocessinginstruction", js.Any.fromFunction2(value))
      
      inline def setOnprocessinginstructionUndefined: Self = StObject.set(x, "onprocessinginstruction", js.undefined)
      
      inline def setOnreset(value: () => Unit): Self = StObject.set(x, "onreset", js.Any.fromFunction0(value))
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOntext(value: /* data */ String => Unit): Self = StObject.set(x, "ontext", js.Any.fromFunction1(value))
      
      inline def setOntextUndefined: Self = StObject.set(x, "ontext", js.undefined)
    }
  }
  
  /* Inlined std.Partial<htmlparser2.htmlparser2/lib/esm/Parser.Handler> */
  trait PartialHandlerOnattribute extends StObject {
    
    var onattribute: js.UndefOr[
        js.Function3[/* name */ String, /* value */ String, /* quote */ js.UndefOr[String | Null], Unit]
      ] = js.undefined
    
    var oncdataend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onclosetag: js.UndefOr[js.Function2[/* name */ String, /* isImplied */ Boolean, Unit]] = js.undefined
    
    var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
    
    var oncommentend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onopentag: js.UndefOr[
        js.Function3[
          /* name */ String, 
          /* attribs */ StringDictionary[String], 
          /* isImplied */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var onopentagname: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
    
    var onparserinit: js.UndefOr[js.Function1[/* parser */ typings.htmlparser2.parserMod.Parser, Unit]] = js.undefined
    
    var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.undefined
    
    var onreset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  }
  object PartialHandlerOnattribute {
    
    inline def apply(): PartialHandlerOnattribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHandlerOnattribute]
    }
    
    extension [Self <: PartialHandlerOnattribute](x: Self) {
      
      inline def setOnattribute(value: (/* name */ String, /* value */ String, /* quote */ js.UndefOr[String | Null]) => Unit): Self = StObject.set(x, "onattribute", js.Any.fromFunction3(value))
      
      inline def setOnattributeUndefined: Self = StObject.set(x, "onattribute", js.undefined)
      
      inline def setOncdataend(value: () => Unit): Self = StObject.set(x, "oncdataend", js.Any.fromFunction0(value))
      
      inline def setOncdataendUndefined: Self = StObject.set(x, "oncdataend", js.undefined)
      
      inline def setOncdatastart(value: () => Unit): Self = StObject.set(x, "oncdatastart", js.Any.fromFunction0(value))
      
      inline def setOncdatastartUndefined: Self = StObject.set(x, "oncdatastart", js.undefined)
      
      inline def setOnclosetag(value: (/* name */ String, /* isImplied */ Boolean) => Unit): Self = StObject.set(x, "onclosetag", js.Any.fromFunction2(value))
      
      inline def setOnclosetagUndefined: Self = StObject.set(x, "onclosetag", js.undefined)
      
      inline def setOncomment(value: /* data */ String => Unit): Self = StObject.set(x, "oncomment", js.Any.fromFunction1(value))
      
      inline def setOncommentUndefined: Self = StObject.set(x, "oncomment", js.undefined)
      
      inline def setOncommentend(value: () => Unit): Self = StObject.set(x, "oncommentend", js.Any.fromFunction0(value))
      
      inline def setOncommentendUndefined: Self = StObject.set(x, "oncommentend", js.undefined)
      
      inline def setOnend(value: () => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction0(value))
      
      inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      inline def setOnerror(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnopentag(
        value: (/* name */ String, /* attribs */ StringDictionary[String], /* isImplied */ Boolean) => Unit
      ): Self = StObject.set(x, "onopentag", js.Any.fromFunction3(value))
      
      inline def setOnopentagUndefined: Self = StObject.set(x, "onopentag", js.undefined)
      
      inline def setOnopentagname(value: /* name */ String => Unit): Self = StObject.set(x, "onopentagname", js.Any.fromFunction1(value))
      
      inline def setOnopentagnameUndefined: Self = StObject.set(x, "onopentagname", js.undefined)
      
      inline def setOnparserinit(value: /* parser */ typings.htmlparser2.parserMod.Parser => Unit): Self = StObject.set(x, "onparserinit", js.Any.fromFunction1(value))
      
      inline def setOnparserinitUndefined: Self = StObject.set(x, "onparserinit", js.undefined)
      
      inline def setOnprocessinginstruction(value: (/* name */ String, /* data */ String) => Unit): Self = StObject.set(x, "onprocessinginstruction", js.Any.fromFunction2(value))
      
      inline def setOnprocessinginstructionUndefined: Self = StObject.set(x, "onprocessinginstruction", js.undefined)
      
      inline def setOnreset(value: () => Unit): Self = StObject.set(x, "onreset", js.Any.fromFunction0(value))
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOntext(value: /* data */ String => Unit): Self = StObject.set(x, "ontext", js.Any.fromFunction1(value))
      
      inline def setOntextUndefined: Self = StObject.set(x, "ontext", js.undefined)
    }
  }
}
