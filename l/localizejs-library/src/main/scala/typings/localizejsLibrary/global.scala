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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Localize extends js.Object {
    /**
      * Bootstrapping translations enables your app to translate without fetching translations remotely from Localizejs.com
      * @param translations Required. Generate properly formatted translations on your Languages page
      */
    def bootstrap(translations: js.Any): Unit = js.native
    /**
      * Returns the visitor's list of preferred languages, based on the browser's "accept-language" header.
      * @param callback Required.
      */
    def detectLanguage(callback: js.Function2[/* error */ js.Any, /* languages */ js.Array[String], Unit]): Unit = js.native
    /**
      * Returns all available languages for the project.
      * @param callback Required.
      */
    def getAvailableLanguages(callback: js.Function2[/* error */ js.Any, /* languages */ js.Array[String], Unit]): Unit = js.native
    /**
      * Returns exchange rate for provided currencies.
      *
      * @param fromCurrency Required. The default source currency, to be converted from.
      * @param toCurrency Required. The new currency, to be converted to.
      * @param callback Required. Receives err and rateData arguments.
      */
    def getExchangeRate(
      fromCurrency: String,
      toCurrency: String,
      callback: js.Function2[/* error */ js.Any, /* rateData */ RateData, Unit]
    ): Unit = js.native
    /**
      * Returns the current language of the page. If a language hasn't been set, source is returned.
      */
    def getLanguage(): String = js.native
    /**
      * Initializes LocalizeJS with the supplied options.
      * @param options An object containing the supplied options.
      */
    def initialize(options: Options): Unit = js.native
    /**
      * Remove an event handler.
      * @param eventName Required. Name of event to unbind to. Can optionally be namespaced: "setLanguage.ns"
      * @param fn Optional. The function to unbind from the event.
      */
    @JSName("off")
    def off_initialize(eventName: initialize): Unit = js.native
    @JSName("off")
    def off_initialize(eventName: initialize, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("off")
    def off_pluralize(eventName: pluralize): Unit = js.native
    @JSName("off")
    def off_pluralize(eventName: pluralize, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("off")
    def off_setLanguage(eventName: setLanguage): Unit = js.native
    @JSName("off")
    def off_setLanguage(eventName: setLanguage, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("off")
    def off_translate(eventName: translate): Unit = js.native
    @JSName("off")
    def off_translate(eventName: translate, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("off")
    def off_untranslatePage(eventName: untranslatePage): Unit = js.native
    @JSName("off")
    def off_untranslatePage(eventName: untranslatePage, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("off")
    def off_updatedDictionary(eventName: updatedDictionary): Unit = js.native
    @JSName("off")
    def off_updatedDictionary(eventName: updatedDictionary, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    /**
      * Attach an event handler to Localize events.
      * @param eventName Required. Name of event to bind to. Can optionally be namespaced: "setLanguage.ns"
      * @param fn Required. Event handler.
      */
    @JSName("on")
    def on_initialize(eventName: initialize, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("on")
    def on_pluralize(eventName: pluralize, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("on")
    def on_setLanguage(eventName: setLanguage, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("on")
    def on_translate(eventName: translate, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("on")
    def on_untranslatePage(eventName: untranslatePage, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    @JSName("on")
    def on_updatedDictionary(eventName: updatedDictionary, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
    /**
      * Saves the phrase, if unrecognized, to your Localize project. Useful for ensuring rarely printed text
      * (ie. an obscure error message) is translated. Returns the phrase it was passed.
      * @param phrase Required. A string or an array of strings
      */
    def phrase(phrase: String): String | js.Array[String] = js.native
    def phrase(phrase: js.Array[String]): String | js.Array[String] = js.native
    /**
      * Speed up language switching by prefetching
      * @param languages Required. Accepts a string or an array or languages (ex. 'zh-CN')
      */
    def prefetch(languages: String): Unit = js.native
    def prefetch(languages: js.Array[String]): Unit = js.native
    /**
      * Translates the page into the given language.
      * @param language Required. Language codes can be found on your Languages page.
      */
    def setLanguage(language: String): Unit = js.native
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
    def translate(input: String): Unit = js.native
    def translate(input: String, variables: js.Any): Unit = js.native
    def translate(
      input: String,
      variables: js.Any,
      callback: js.Function1[/* translation */ String | HTMLElement, Unit]
    ): Unit = js.native
    def translate(input: HTMLElement): Unit = js.native
    def translate(input: HTMLElement, variables: js.Any): Unit = js.native
    def translate(
      input: HTMLElement,
      variables: js.Any,
      callback: js.Function1[/* translation */ String | HTMLElement, Unit]
    ): Unit = js.native
    /**
      * Translates all text on the page
      */
    def translatePage(): Unit = js.native
    /**
      * Untranslates a specified element on the page. Use Localize.untranslatePage() if untranslating the whole page.
      * @param element Required. A DOM node to untranslate
      */
    def untranslate(element: String): Unit = js.native
    /**
      * Untranslates all text on the page
      */
    def untranslatePage(): Unit = js.native
  }
  
}

