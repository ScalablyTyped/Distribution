package typings
package jqueryDotFlagstrapLib.jQueryFlagStrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FlagStrapOptions extends js.Object {
  /**
           * Default: "btn-md"
           * The bootstrap button size `class` for this drop down
           */
  var buttonSize: java.lang.String
  /**
           * Default: "btn-default"
           * The bootstrap button type `class` for this drop down
           */
  var buttonType: java.lang.String
  /**
          * Default: (all)
          * Only show specific countries
          * Example:
          * 
          * {"GB": "United Kingdom", "US": "United States"}
          * 
          * will only show the USA and UK.
          */
  var countries: js.UndefOr[js.Object] = js.undefined
  /**
           * Default: uniquely generated
           * the `id` attribute for the actual `select` input
           */
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Default: uniquely generated
           * the `name` attribute for the actual `select` input
           */
  var inputName: java.lang.String
  /**
           * Default: "20px"
           * The `margin` between `flag` and `text label`
           */
  var labelMargin: java.lang.String
  /**
           * Default: null
           * This callback gets called each time the select is changed. It receives two parameters, the new value, and the select element.
           */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* element */ js.Any, scala.Unit]] = js.undefined
  /**
           * Default: {value: "", text: "Please select a country"}
           * Set the placeholder value and text. To disable the placeholder define as (boolean) false.
           */
  var placeholder: scala.Boolean | FlagStrapPlaceholderOptions
  /**
           * Default: false
           * Scrollable or full height drop down
           */
  var scrollable: scala.Boolean
  /**
           * Default: "250px"
           * `max-height` for the scrollable drop down
           */
  var scrollableHeight: js.UndefOr[java.lang.String] = js.undefined
}

