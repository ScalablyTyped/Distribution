package typings.localizejsLibrary

import typings.localizejsLibrary.LocalizeJS.Context.Options
import typings.localizejsLibrary.LocalizeJS.Context.RateData
import typings.localizejsLibrary.localizejsLibraryStrings.initialize
import typings.localizejsLibrary.localizejsLibraryStrings.pluralize
import typings.localizejsLibrary.localizejsLibraryStrings.setLanguage
import typings.localizejsLibrary.localizejsLibraryStrings.translate
import typings.localizejsLibrary.localizejsLibraryStrings.untranslatePage
import typings.localizejsLibrary.localizejsLibraryStrings.updatedDictionary
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Localize {
    
    @JSGlobal("Localize")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Bootstrapping translations enables your app to translate without fetching translations remotely from Localizejs.com
      * @param translations Required. Generate properly formatted translations on your Languages page
      */
    inline def bootstrap(translations: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrap")(translations.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Returns the visitor's list of preferred languages, based on the browser's "accept-language" header.
      * @param callback Required.
      */
    inline def detectLanguage(callback: js.Function2[/* error */ js.Any, /* languages */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Returns all available languages for the project.
      * @param callback Required.
      */
    inline def getAvailableLanguages(callback: js.Function2[/* error */ js.Any, /* languages */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableLanguages")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Returns exchange rate for provided currencies.
      *
      * @param fromCurrency Required. The default source currency, to be converted from.
      * @param toCurrency Required. The new currency, to be converted to.
      * @param callback Required. Receives err and rateData arguments.
      */
    inline def getExchangeRate(
      fromCurrency: String,
      toCurrency: String,
      callback: js.Function2[/* error */ js.Any, /* rateData */ RateData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeRate")(fromCurrency.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns the current language of the page. If a language hasn't been set, source is returned.
      */
    inline def getLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String]
    
    /**
      * Initializes LocalizeJS with the supplied options.
      * @param options An object containing the supplied options.
      */
    inline def initialize(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Remove an event handler.
      * @param eventName Required. Name of event to unbind to. Can optionally be namespaced: "setLanguage.ns"
      * @param fn Optional. The function to unbind from the event.
      */
    inline def off_initialize(eventName: initialize): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_initialize(eventName: initialize, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_pluralize(eventName: pluralize): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_pluralize(eventName: pluralize, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_setLanguage(eventName: setLanguage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_setLanguage(eventName: setLanguage, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_translate(eventName: translate): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_translate(eventName: translate, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_untranslatePage(eventName: untranslatePage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_untranslatePage(eventName: untranslatePage, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_updatedDictionary(eventName: updatedDictionary): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_updatedDictionary(eventName: updatedDictionary, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Attach an event handler to Localize events.
      * @param eventName Required. Name of event to bind to. Can optionally be namespaced: "setLanguage.ns"
      * @param fn Required. Event handler.
      */
    inline def on_initialize(eventName: initialize, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_pluralize(eventName: pluralize, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_setLanguage(eventName: setLanguage, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_translate(eventName: translate, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_untranslatePage(eventName: untranslatePage, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_updatedDictionary(eventName: updatedDictionary, fn: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Saves the phrase, if unrecognized, to your Localize project. Useful for ensuring rarely printed text
      * (ie. an obscure error message) is translated. Returns the phrase it was passed.
      * @param phrase Required. A string or an array of strings
      */
    inline def phrase(phrase: String): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("phrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
    inline def phrase(phrase: js.Array[String]): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("phrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
    
    /**
      * Speed up language switching by prefetching
      * @param languages Required. Accepts a string or an array or languages (ex. 'zh-CN')
      */
    inline def prefetch(languages: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(languages.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def prefetch(languages: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(languages.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Translates the page into the given language.
      * @param language Required. Language codes can be found on your Languages page.
      */
    inline def setLanguage(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Translates text or text within html.
      *
      * If the Localize.translate() input is a string, instances of %{variable} will be replaced with the given value in the variables object.
      * You may also use HTML <var> tags in the string
      *
      * If the active language is the source language of the page, Localize.translate will return the untranslated phrase.
      * Localize.translate can be used with or without a callback. We highly recommend using the callback approach if you're calling
      * Localize.translate in the first 10 seconds of page load to ensure that the latest translations are available. The callback will
      * allow the translation to delay until translations have been fully loaded into the browser. If the translations are already
      * loaded, the callback is executed immediately.
      *
      * @param input Required. Can be text, html or native DOM elements
      * @param variables Optional. Object of variables that will be replaced in the input, if it's a string
      * @param callback Optional. Callback will trigger once translations have been fetched from Localize.
      */
    inline def translate(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def translate(input: String, variables: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(
      input: String,
      variables: js.Any,
      callback: js.Function1[/* translation */ String | HTMLElement, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(
      input: String,
      variables: Unit,
      callback: js.Function1[/* translation */ String | HTMLElement, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(input: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def translate(input: HTMLElement, variables: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(
      input: HTMLElement,
      variables: js.Any,
      callback: js.Function1[/* translation */ String | HTMLElement, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(
      input: HTMLElement,
      variables: Unit,
      callback: js.Function1[/* translation */ String | HTMLElement, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(input.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Translates all text on the page
      */
    inline def translatePage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translatePage")().asInstanceOf[Unit]
    
    /**
      * Untranslates a specified element on the page. Use Localize.untranslatePage() if untranslating the whole page.
      * @param element Required. A DOM node to untranslate
      */
    inline def untranslate(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untranslate")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Untranslates all text on the page
      */
    inline def untranslatePage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untranslatePage")().asInstanceOf[Unit]
  }
}
