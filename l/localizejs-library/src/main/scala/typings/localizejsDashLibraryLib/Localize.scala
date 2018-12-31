package typings
package localizejsDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Localize")
@js.native
object Localize extends js.Object {
  /**
    * Bootstrapping translations enables your app to translate without fetching translations remotely from Localizejs.com
    * @param translations Required. Generate properly formatted translations on your Languages page
    */
  def bootstrap(translations: js.Any): scala.Unit = js.native
  /**
    * Returns the visitor's list of preferred languages, based on the browser's "accept-language" header.
    * @param callback Required.
    */
  def detectLanguage(callback: js.Function2[/* error */ js.Any, /* languages */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * Returns all available languages for the project.
    * @param callback Required.
    */
  def getAvailableLanguages(callback: js.Function2[/* error */ js.Any, /* languages */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * Returns exchange rate for provided currencies.
    *
    * @param fromCurrency Required. The default source currency, to be converted from.
    * @param toCurrency Required. The new currency, to be converted to.
    * @param callback Required. Receives err and rateData arguments.
    */
  def getExchangeRate(
    fromCurrency: java.lang.String,
    toCurrency: java.lang.String,
    callback: js.Function2[
      /* error */ js.Any, 
      /* rateData */ localizejsDashLibraryLib.LocalizeJSNs.ContextNs.RateData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the current language of the page. If a language hasn't been set, source is returned.
    */
  def getLanguage(): java.lang.String = js.native
  /**
    * Initializes LocalizeJS with the supplied options.
    * @param options An object containing the supplied options.
    */
  def initialize(options: localizejsDashLibraryLib.LocalizeJSNs.ContextNs.Options): scala.Unit = js.native
  /**
    * Remove an event handler.
    * @param eventName Required. Name of event to unbind to. Can optionally be namespaced: "setLanguage.ns"
    * @param fn Optional. The function to unbind from the event.
    */
  @JSName("off")
  def off_initialize(eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.initialize): scala.Unit = js.native
  @JSName("off")
  def off_initialize(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.initialize,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_pluralize(eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.pluralize): scala.Unit = js.native
  @JSName("off")
  def off_pluralize(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.pluralize,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_setLanguage(eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.setLanguage): scala.Unit = js.native
  @JSName("off")
  def off_setLanguage(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.setLanguage,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_translate(eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.translate): scala.Unit = js.native
  @JSName("off")
  def off_translate(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.translate,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_untranslatePage(eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.untranslatePage): scala.Unit = js.native
  @JSName("off")
  def off_untranslatePage(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.untranslatePage,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_updatedDictionary(eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.updatedDictionary): scala.Unit = js.native
  @JSName("off")
  def off_updatedDictionary(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.updatedDictionary,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Attach an event handler to Localize events.
    * @param eventName Required. Name of event to bind to. Can optionally be namespaced: "setLanguage.ns"
    * @param fn Required. Event handler.
    */
  @JSName("on")
  def on_initialize(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.initialize,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_pluralize(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.pluralize,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_setLanguage(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.setLanguage,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_translate(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.translate,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_untranslatePage(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.untranslatePage,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_updatedDictionary(
    eventName: localizejsDashLibraryLib.localizejsDashLibraryLibStrings.updatedDictionary,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Saves the phrase, if unrecognized, to your Localize project. Useful for ensuring rarely printed text
    * (ie. an obscure error message) is translated. Returns the phrase it was passed.
    * @param phrase Required. A string or an array of strings
    */
  def phrase(phrase: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
  def phrase(phrase: js.Array[java.lang.String]): java.lang.String | js.Array[java.lang.String] = js.native
  /**
    * Speed up language switching by prefetching
    * @param languages Required. Accepts a string or an array or languages (ex. 'zh-CN')
    */
  def prefetch(languages: java.lang.String): scala.Unit = js.native
  def prefetch(languages: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Translates the page into the given language.
    * @param language Required. Language codes can be found on your Languages page.
    */
  def setLanguage(language: java.lang.String): scala.Unit = js.native
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
  def translate(input: java.lang.String): scala.Unit = js.native
  def translate(input: java.lang.String, variables: js.Any): scala.Unit = js.native
  def translate(
    input: java.lang.String,
    variables: js.Any,
    callback: js.Function1[/* translation */ java.lang.String | stdLib.HTMLElement, scala.Unit]
  ): scala.Unit = js.native
  def translate(input: stdLib.HTMLElement): scala.Unit = js.native
  def translate(input: stdLib.HTMLElement, variables: js.Any): scala.Unit = js.native
  def translate(
    input: stdLib.HTMLElement,
    variables: js.Any,
    callback: js.Function1[/* translation */ java.lang.String | stdLib.HTMLElement, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Translates all text on the page
    */
  def translatePage(): scala.Unit = js.native
  /**
    * Untranslates a specified element on the page. Use Localize.untranslatePage() if untranslating the whole page.
    * @param element Required. A DOM node to untranslate
    */
  def untranslate(element: java.lang.String): scala.Unit = js.native
  /**
    * Untranslates all text on the page
    */
  def untranslatePage(): scala.Unit = js.native
}

