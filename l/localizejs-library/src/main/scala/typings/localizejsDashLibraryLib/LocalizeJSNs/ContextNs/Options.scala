package typings
package localizejsDashLibraryLib.LocalizeJSNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Defaults to true. Automatically default the page language to the user's preferred language. The first path segment
    * in the URL is used to check to detect the language, ie. www.localize.com/fr. If no language dictionary exists for that
    * segment then the language setting in their browser is used.
    */
  var autodetectLanguage: scala.Boolean
  /**
    * The base path will be stripped from the URL of the phrase as seen in the "Filter by pages" feature.
    */
  var basePath: java.lang.String
  /**
    * Array of class names for which Localize will ignore.
    */
  var blockedClasses: js.Array[java.lang.String]
  /**
    * The default language your website will be in when no language has been selected. Defaults to the source language of your website.
    */
  var defaultLanguage: java.lang.String
  /**
    * Defaults to false. If true, the Localize library will not send additional metadata to our servers.
    * This metadata includes the surrounding HTML of the phrases detected on your website.
    */
  var enhancedContentSecurity: scala.Boolean
  /**
    * Defaults to true. If true, translations will be fetched from Localize if not bootstrapped.
    */
  var fetchTranslations: scala.Boolean
  /**
    * Required. Your project key.
    */
  var key: java.lang.String
  /**
    * Defaults to false. Set to true to prefetch all active languages, or pass a language code or an array of codes to.
    */
  var prefetch: scala.Boolean
  /**
    * Defaults to false. If true, Localize will translate your website to the last selected language on subsequent page views.
    */
  var rememberLanguage: scala.Boolean
  /**
    * Defaults to false. Automatically translate content that is added dynamically to your webpage.
    * For example, if your webpage dynamically adds html into the source of the page, our library
    * will translate it once the translations have been generated. Behind the scenes this means the
    * dictionary file with all your translated content is available for use with Localize.translate().
    * However, translations are not generated instantly, so use with our library event updatedDictionary is recommended.
    */
  var retranslateOnNewPhrases: scala.Boolean
  /**
    * Defaults to true. If true, unrecognized phrases will be added to your Localize account. Disable this in development.
    */
  var saveNewPhrases: scala.Boolean
  /**
    * Defaults to false. If true, Localize will detect phrases only when the page is not translated.
    * Please contact support@localizejs.com prior to updating this option.
    */
  var saveNewPhrasesFromSource: scala.Boolean
  /**
    * Language to translate your website to.
    */
  var targetLanguage: java.lang.String
  /**
    * Defaults to true. If true, "alt" attributes will be translated.
    */
  var translateAlt: scala.Boolean
  /**
    * Defaults to false. When true, Localize will attempt to translate the entire body of the page.
    * If false, Localize will only translate content contained with a "localizejs" class name.
    */
  var translateBody: scala.Boolean
  /**
    * Array of class names for which Localize will translate. If you use this option, Localize will only translate content
    * contained in these classes and will ignore all other content in the body of the page.
    */
  var translateClasses: js.Array[java.lang.String]
  /**
    * Defaults to false. Allows users to turn on meta tag translation. This optimizes your site for SEO.
    */
  var translateMetaTags: scala.Boolean
  /**
    * Defaults to false. If true, the Localize library will pick up numbers as phrases.
    */
  var translateNumbers: scala.Boolean
  /**
    * Defaults to false. If true, the Localize library will pick up phrases in the <time> elements.
    */
  var translateTimeElement: scala.Boolean
  /**
    * Defaults to true. If true, the <title> of the page will translate.
    */
  var translateTitle: scala.Boolean
}

