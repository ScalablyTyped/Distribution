package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Croporiginalsize
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaConfigureOptionsMod {
  
  trait MediaConfigureOptions extends StObject {
    
    var disable_comments: js.UndefOr[Boolean] = js.undefined
    
    var edits: js.UndefOr[Croporiginalsize] = js.undefined
    
    var extra: js.UndefOr[Sourceheight] = js.undefined
    
    var geotag_enabled: js.UndefOr[`1` | `0`] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var media_folder: js.UndefOr[String] = js.undefined
    
    var media_latitude: js.UndefOr[String] = js.undefined
    
    var media_longitude: js.UndefOr[String] = js.undefined
    
    var posting_latitude: js.UndefOr[String] = js.undefined
    
    var posting_longitude: js.UndefOr[String] = js.undefined
    
    var scene_capture_type: js.UndefOr[String] = js.undefined
    
    var software: js.UndefOr[String] = js.undefined
    
    var source_type: js.UndefOr[String] = js.undefined
    
    var upload_id: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MediaConfigureOptions {
    
    @scala.inline
    def apply(upload_id: String): MediaConfigureOptions = {
      val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureOptions]
    }
    
    @scala.inline
    implicit class MediaConfigureOptionsMutableBuilder[Self <: MediaConfigureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable_comments(value: Boolean): Self = StObject.set(x, "disable_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_commentsUndefined: Self = StObject.set(x, "disable_comments", js.undefined)
      
      @scala.inline
      def setEdits(value: Croporiginalsize): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
      
      @scala.inline
      def setExtra(value: Sourceheight): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setGeotag_enabled(value: `1` | `0`): Self = StObject.set(x, "geotag_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeotag_enabledUndefined: Self = StObject.set(x, "geotag_enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMedia_folder(value: String): Self = StObject.set(x, "media_folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_folderUndefined: Self = StObject.set(x, "media_folder", js.undefined)
      
      @scala.inline
      def setMedia_latitude(value: String): Self = StObject.set(x, "media_latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_latitudeUndefined: Self = StObject.set(x, "media_latitude", js.undefined)
      
      @scala.inline
      def setMedia_longitude(value: String): Self = StObject.set(x, "media_longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_longitudeUndefined: Self = StObject.set(x, "media_longitude", js.undefined)
      
      @scala.inline
      def setPosting_latitude(value: String): Self = StObject.set(x, "posting_latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosting_latitudeUndefined: Self = StObject.set(x, "posting_latitude", js.undefined)
      
      @scala.inline
      def setPosting_longitude(value: String): Self = StObject.set(x, "posting_longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosting_longitudeUndefined: Self = StObject.set(x, "posting_longitude", js.undefined)
      
      @scala.inline
      def setScene_capture_type(value: String): Self = StObject.set(x, "scene_capture_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScene_capture_typeUndefined: Self = StObject.set(x, "scene_capture_type", js.undefined)
      
      @scala.inline
      def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
      
      @scala.inline
      def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MediaConfigureTimelineOptions
    extends StObject
       with MediaConfigureOptions {
    
    var camera_make: js.UndefOr[String] = js.undefined
    
    var camera_model: js.UndefOr[String] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var creation_logger_session_id: js.UndefOr[String] = js.undefined
    
    var date_time_digitalized: js.UndefOr[String] = js.undefined
    
    var date_time_original: js.UndefOr[String] = js.undefined
    
    var device_id: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[MediaLocation | String] = js.undefined
    
    var timezone_offset: js.UndefOr[String] = js.undefined
    
    var usertags: js.UndefOr[PostingUsertags | String] = js.undefined
  }
  object MediaConfigureTimelineOptions {
    
    @scala.inline
    def apply(upload_id: String): MediaConfigureTimelineOptions = {
      val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigureTimelineOptions]
    }
    
    @scala.inline
    implicit class MediaConfigureTimelineOptionsMutableBuilder[Self <: MediaConfigureTimelineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera_make(value: String): Self = StObject.set(x, "camera_make", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera_makeUndefined: Self = StObject.set(x, "camera_make", js.undefined)
      
      @scala.inline
      def setCamera_model(value: String): Self = StObject.set(x, "camera_model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera_modelUndefined: Self = StObject.set(x, "camera_model", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setCreation_logger_session_id(value: String): Self = StObject.set(x, "creation_logger_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreation_logger_session_idUndefined: Self = StObject.set(x, "creation_logger_session_id", js.undefined)
      
      @scala.inline
      def setDate_time_digitalized(value: String): Self = StObject.set(x, "date_time_digitalized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_time_digitalizedUndefined: Self = StObject.set(x, "date_time_digitalized", js.undefined)
      
      @scala.inline
      def setDate_time_original(value: String): Self = StObject.set(x, "date_time_original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_time_originalUndefined: Self = StObject.set(x, "date_time_original", js.undefined)
      
      @scala.inline
      def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
      
      @scala.inline
      def setLocation(value: MediaLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
      
      @scala.inline
      def setUsertags(value: PostingUsertags | String): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    }
  }
  
  trait MediaLocation extends StObject {
    
    var address: String
    
    var external_id: String
    
    var external_source: String
    
    var lat: Double
    
    var lng: Double
    
    var name: String
  }
  object MediaLocation {
    
    @scala.inline
    def apply(
      address: String,
      external_id: String,
      external_source: String,
      lat: Double,
      lng: Double,
      name: String
    ): MediaLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaLocation]
    }
    
    @scala.inline
    implicit class MediaLocationMutableBuilder[Self <: MediaLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
