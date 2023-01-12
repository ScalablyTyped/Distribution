package typings.localizejsLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalizeJS {
  
  object Context {
    
    trait Options extends StObject {
      
      /**
        * Defaults to false.
        * If true and you have machine translations enabled, any new phrases found in your website will be automatically
        * moved to the Published bin, and a machine translation will be generated.
        */
      var autoApprove: Boolean
      
      /**
        * Defaults to true. Automatically default the page language to the user's preferred language. The first path segment
        * in the URL is used to check to detect the language, ie. www.localize.com/fr. If no language dictionary exists for that
        * segment then the language setting in their browser is used.
        */
      var autodetectLanguage: Boolean
      
      /**
        * The base path will be stripped from the URL of the phrase as seen in the "Filter by pages" feature.
        */
      var basePath: String
      
      /**
        * Array of class names for which Localize will ignore.
        */
      var blockedClasses: js.Array[String]
      
      /**
        * Array of CSS ID selectors.
        */
      var blockedIds: js.Array[String]
      
      /**
        * The default language your website will be in when no language has been selected. Defaults to the source language of your website.
        */
      var defaultLanguage: String
      
      /**
        * Defaults to false. When true, the default Localize widget is disabled.
        */
      var disableWidget: Boolean
      
      /**
        * Defaults to false. If true, the Localize library will not send additional metadata to our servers.
        * This metadata includes the surrounding HTML of the phrases detected on your website.
        */
      var enhancedContentSecurity: Boolean
      
      /**
        * Defaults to true. If true, translations will be fetched from Localize if not bootstrapped.
        */
      var fetchTranslations: Boolean
      
      /**
        * Required. Your project key.
        */
      var key: String
      
      /**
        * Defaults to false. If true, the image URLs used in your website will appear in your phrases bin to allow for image replacement based on language.
        */
      var localizeImages: Boolean
      
      /**
        * Defaults to false. Set to true to prefetch all active languages, or pass a language code or an array of codes to.
        */
      var prefetch: Boolean
      
      /**
        * Defaults to false. If true, Localize will translate your website to the last selected language on subsequent page views.
        */
      var rememberLanguage: Boolean
      
      /**
        * Defaults to false. Automatically translate content that is added dynamically to your webpage.
        * For example, if your webpage dynamically adds html into the source of the page, our library
        * will translate it once the translations have been generated. Behind the scenes this means the
        * dictionary file with all your translated content is available for use with Localize.translate().
        * However, translations are not generated instantly, so use with our library event updatedDictionary is recommended.
        */
      var retranslateOnNewPhrases: Boolean
      
      /**
        * Defaults to true. If true, unrecognized phrases will be added to your Localize account. Disable this in development.
        */
      var saveNewPhrases: Boolean
      
      /**
        * Defaults to false. If true, Localize will detect phrases only when the page is not translated.
        * Please contact support@localizejs.com prior to updating this option.
        */
      var saveNewPhrasesFromSource: Boolean
      
      /**
        * Language to translate your website to.
        */
      var targetLanguage: String
      
      /**
        * Defaults to true. If true, "alt" attributes will be translated.
        */
      var translateAlt: Boolean
      
      /**
        * Defaults to true. If true, aria-label attributes within HTML elements will be found by Localize and brought into the dashboard, allowing you to translate them.
        */
      var translateAriaLabels: Boolean
      
      /**
        * Defaults to false. When true, Localize will attempt to translate the entire body of the page.
        * If false, Localize will only translate content contained with a "localizejs" class name.
        */
      var translateBody: Boolean
      
      /**
        * Array of class names for which Localize will translate. If you use this option, Localize will only translate content
        * contained in these classes and will ignore all other content in the body of the page.
        */
      var translateClasses: js.Array[String]
      
      /**
        * Defaults to false. Allows users to turn on meta tag translation. This optimizes your site for SEO.
        */
      var translateMetaTags: Boolean
      
      /**
        * Defaults to false. If true, the Localize library will pick up numbers as phrases.
        */
      var translateNumbers: Boolean
      
      /**
        * Defaults to true. If true, text contained within SVGs will be found by Localize and brought into the dashboard,
        * allowing you to translate the text. (SVG files are not supported)
        */
      var translateSVGElement: Boolean
      
      /**
        * Defaults to false. If true, the Localize library will pick up phrases in the <time> elements.
        */
      var translateTimeElement: Boolean
      
      /**
        * Defaults to true. If true, the <title> of the page will translate.
        */
      var translateTitle: Boolean
    }
    object Options {
      
      inline def apply(
        autoApprove: Boolean,
        autodetectLanguage: Boolean,
        basePath: String,
        blockedClasses: js.Array[String],
        blockedIds: js.Array[String],
        defaultLanguage: String,
        disableWidget: Boolean,
        enhancedContentSecurity: Boolean,
        fetchTranslations: Boolean,
        key: String,
        localizeImages: Boolean,
        prefetch: Boolean,
        rememberLanguage: Boolean,
        retranslateOnNewPhrases: Boolean,
        saveNewPhrases: Boolean,
        saveNewPhrasesFromSource: Boolean,
        targetLanguage: String,
        translateAlt: Boolean,
        translateAriaLabels: Boolean,
        translateBody: Boolean,
        translateClasses: js.Array[String],
        translateMetaTags: Boolean,
        translateNumbers: Boolean,
        translateSVGElement: Boolean,
        translateTimeElement: Boolean,
        translateTitle: Boolean
      ): Options = {
        val __obj = js.Dynamic.literal(autoApprove = autoApprove.asInstanceOf[js.Any], autodetectLanguage = autodetectLanguage.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], blockedClasses = blockedClasses.asInstanceOf[js.Any], blockedIds = blockedIds.asInstanceOf[js.Any], defaultLanguage = defaultLanguage.asInstanceOf[js.Any], disableWidget = disableWidget.asInstanceOf[js.Any], enhancedContentSecurity = enhancedContentSecurity.asInstanceOf[js.Any], fetchTranslations = fetchTranslations.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], localizeImages = localizeImages.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], rememberLanguage = rememberLanguage.asInstanceOf[js.Any], retranslateOnNewPhrases = retranslateOnNewPhrases.asInstanceOf[js.Any], saveNewPhrases = saveNewPhrases.asInstanceOf[js.Any], saveNewPhrasesFromSource = saveNewPhrasesFromSource.asInstanceOf[js.Any], targetLanguage = targetLanguage.asInstanceOf[js.Any], translateAlt = translateAlt.asInstanceOf[js.Any], translateAriaLabels = translateAriaLabels.asInstanceOf[js.Any], translateBody = translateBody.asInstanceOf[js.Any], translateClasses = translateClasses.asInstanceOf[js.Any], translateMetaTags = translateMetaTags.asInstanceOf[js.Any], translateNumbers = translateNumbers.asInstanceOf[js.Any], translateSVGElement = translateSVGElement.asInstanceOf[js.Any], translateTimeElement = translateTimeElement.asInstanceOf[js.Any], translateTitle = translateTitle.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAutoApprove(value: Boolean): Self = StObject.set(x, "autoApprove", value.asInstanceOf[js.Any])
        
        inline def setAutodetectLanguage(value: Boolean): Self = StObject.set(x, "autodetectLanguage", value.asInstanceOf[js.Any])
        
        inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        inline def setBlockedClasses(value: js.Array[String]): Self = StObject.set(x, "blockedClasses", value.asInstanceOf[js.Any])
        
        inline def setBlockedClassesVarargs(value: String*): Self = StObject.set(x, "blockedClasses", js.Array(value*))
        
        inline def setBlockedIds(value: js.Array[String]): Self = StObject.set(x, "blockedIds", value.asInstanceOf[js.Any])
        
        inline def setBlockedIdsVarargs(value: String*): Self = StObject.set(x, "blockedIds", js.Array(value*))
        
        inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
        
        inline def setDisableWidget(value: Boolean): Self = StObject.set(x, "disableWidget", value.asInstanceOf[js.Any])
        
        inline def setEnhancedContentSecurity(value: Boolean): Self = StObject.set(x, "enhancedContentSecurity", value.asInstanceOf[js.Any])
        
        inline def setFetchTranslations(value: Boolean): Self = StObject.set(x, "fetchTranslations", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setLocalizeImages(value: Boolean): Self = StObject.set(x, "localizeImages", value.asInstanceOf[js.Any])
        
        inline def setPrefetch(value: Boolean): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
        
        inline def setRememberLanguage(value: Boolean): Self = StObject.set(x, "rememberLanguage", value.asInstanceOf[js.Any])
        
        inline def setRetranslateOnNewPhrases(value: Boolean): Self = StObject.set(x, "retranslateOnNewPhrases", value.asInstanceOf[js.Any])
        
        inline def setSaveNewPhrases(value: Boolean): Self = StObject.set(x, "saveNewPhrases", value.asInstanceOf[js.Any])
        
        inline def setSaveNewPhrasesFromSource(value: Boolean): Self = StObject.set(x, "saveNewPhrasesFromSource", value.asInstanceOf[js.Any])
        
        inline def setTargetLanguage(value: String): Self = StObject.set(x, "targetLanguage", value.asInstanceOf[js.Any])
        
        inline def setTranslateAlt(value: Boolean): Self = StObject.set(x, "translateAlt", value.asInstanceOf[js.Any])
        
        inline def setTranslateAriaLabels(value: Boolean): Self = StObject.set(x, "translateAriaLabels", value.asInstanceOf[js.Any])
        
        inline def setTranslateBody(value: Boolean): Self = StObject.set(x, "translateBody", value.asInstanceOf[js.Any])
        
        inline def setTranslateClasses(value: js.Array[String]): Self = StObject.set(x, "translateClasses", value.asInstanceOf[js.Any])
        
        inline def setTranslateClassesVarargs(value: String*): Self = StObject.set(x, "translateClasses", js.Array(value*))
        
        inline def setTranslateMetaTags(value: Boolean): Self = StObject.set(x, "translateMetaTags", value.asInstanceOf[js.Any])
        
        inline def setTranslateNumbers(value: Boolean): Self = StObject.set(x, "translateNumbers", value.asInstanceOf[js.Any])
        
        inline def setTranslateSVGElement(value: Boolean): Self = StObject.set(x, "translateSVGElement", value.asInstanceOf[js.Any])
        
        inline def setTranslateTimeElement(value: Boolean): Self = StObject.set(x, "translateTimeElement", value.asInstanceOf[js.Any])
        
        inline def setTranslateTitle(value: Boolean): Self = StObject.set(x, "translateTitle", value.asInstanceOf[js.Any])
      }
    }
    
    trait RateData extends StObject {
      
      var fromCurrency: String
      
      var rate: String
      
      var toCurrency: String
    }
    object RateData {
      
      inline def apply(fromCurrency: String, rate: String, toCurrency: String): RateData = {
        val __obj = js.Dynamic.literal(fromCurrency = fromCurrency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], toCurrency = toCurrency.asInstanceOf[js.Any])
        __obj.asInstanceOf[RateData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RateData] (val x: Self) extends AnyVal {
        
        inline def setFromCurrency(value: String): Self = StObject.set(x, "fromCurrency", value.asInstanceOf[js.Any])
        
        inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
        
        inline def setToCurrency(value: String): Self = StObject.set(x, "toCurrency", value.asInstanceOf[js.Any])
      }
    }
  }
}
