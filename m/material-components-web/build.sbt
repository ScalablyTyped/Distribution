organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-6e46fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-45796b",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-791c2a",
  "org.scalablytyped" %%% "material__base" % "14.0.0-6f911e",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-081071",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-bc1736",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-605fcb",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-fcbe4a",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-011000",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-bb61a3",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-ca5dc4",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-77fe35",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-7e9af7",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-4c1a34",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-6eabb0",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-8fa86b",
  "org.scalablytyped" %%% "material__list" % "14.0.0-2d5979",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-0d0d4a",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-b64bd0",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-3a7c30",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-3832c4",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-b1b96a",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-195ed4",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-6e3d79",
  "org.scalablytyped" %%% "material__select" % "14.0.0-0c3f03",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-2c6afd",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-6d09f9",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-318bcf",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-309a24",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-fddf73",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-340a49",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-571b6a",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-c0c239",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-e0048c",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-e67f28",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
