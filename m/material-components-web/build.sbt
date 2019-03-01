organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-d49a80"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-bd6d08",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-334d9c",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190213Z-d687e6",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-19faec",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190213Z-1ee0f4",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-604157",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-d8550c",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-fd52f0",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190213Z-bf24d3",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-ebe09b",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190213Z-ea0d28",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-e86d42",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-a281a1",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-f5844f",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-1be525",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-034bd7",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190213Z-324199",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-53e31d",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190213Z-6d85ed",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-4bd927",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190213Z-4d7bc5",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190213Z-21066a",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190213Z-d07f3e",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190213Z-d0a47c",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190213Z-64b121",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-add651",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        