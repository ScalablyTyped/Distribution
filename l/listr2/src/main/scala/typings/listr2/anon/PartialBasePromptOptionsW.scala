package typings.listr2.anon

import typings.enquirer.mod.Prompt_
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<listr2.listr2.BasePromptOptionsWithName> */
trait PartialBasePromptOptionsW extends StObject {
  
  var footer: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[js.Function1[/* value */ Any, Any | js.Promise[Any]]] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var initial: js.UndefOr[
    Boolean | Double | js.Array[Double] | String | (js.Function0[js.Promise[String] | String])
  ] = js.undefined
  
  var message: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.undefined
  
  var name: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  var onCancel: js.UndefOr[
    js.Function3[/* name */ Any, /* value */ Any, /* prompt */ Prompt_, Boolean | js.Promise[Boolean]]
  ] = js.undefined
  
  var onSubmit: js.UndefOr[
    js.Function3[/* name */ Any, /* value */ Any, /* prompt */ Prompt_, Boolean | js.Promise[Boolean]]
  ] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var result: js.UndefOr[js.Function1[/* value */ Any, Any | js.Promise[Any]]] = js.undefined
  
  var skip: js.UndefOr[js.Function1[/* value */ Any, Boolean | js.Promise[Boolean]]] = js.undefined
  
  var stdin: js.UndefOr[ReadStream] = js.undefined
  
  var stdout: js.UndefOr[WriteStream] = js.undefined
  
  var validate: js.UndefOr[
    js.Function2[/* value */ Any, /* state */ Any, Boolean | (js.Promise[Boolean | String]) | String]
  ] = js.undefined
}
object PartialBasePromptOptionsW {
  
  inline def apply(): PartialBasePromptOptionsW = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBasePromptOptionsW]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBasePromptOptionsW] (val x: Self) extends AnyVal {
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: /* value */ Any => Any | js.Promise[Any]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setInitial(value: Boolean | Double | js.Array[Double] | String | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "initial", js.Any.fromFunction0(value))
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: Double*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setMessage(value: String | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String | js.Function0[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameFunction0(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnCancel(value: (/* name */ Any, /* value */ Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "onCancel", js.Any.fromFunction3(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnSubmit(value: (/* name */ Any, /* value */ Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setResult(value: /* value */ Any => Any | js.Promise[Any]): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSkip(value: /* value */ Any => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setValidate(value: (/* value */ Any, /* state */ Any) => Boolean | (js.Promise[Boolean | String]) | String): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
