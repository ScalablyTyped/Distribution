organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-1a883a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-48ebce",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-01ea4d",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-15f0b6",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-e21c5f",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-2fb020",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-9e8b38",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-f96b68",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-1ed4bc",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-b911c2",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-3b40b5",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5acf58",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-c87401",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-e9960c",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-848eba",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-aa13b3",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-f8c096",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-4a5765",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-ce1d1b",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-1bdcbc",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-b66f4b",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-8b6337",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-0447e1",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-f8bbd6",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-347c23",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-926a3e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        