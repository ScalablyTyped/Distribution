organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-3c12fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-85a557",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-e04ca8",
  "org.scalablytyped" %%% "material__base" % "14.0.0-8c8aee",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-42b4ff",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-eb1679",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-8b00d9",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-df5e75",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-355d8d",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-4cb3b5",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-a2415b",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-79aac5",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-283c2c",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-bb6de1",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-a4d14b",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-60dc0b",
  "org.scalablytyped" %%% "material__list" % "14.0.0-bbb30e",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-7c3640",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-8f16cf",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-2df2f7",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-90ecb7",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-450213",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-034b0d",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-62eb34",
  "org.scalablytyped" %%% "material__select" % "14.0.0-f64891",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-d2a37b",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-44ac64",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-9c18f9",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-448cc7",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-ae8fa7",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-b92698",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-81cd54",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-09591d",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-28a51b",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-1f7e23",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
